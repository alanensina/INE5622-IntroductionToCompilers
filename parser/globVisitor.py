from build import tajaParser
from . import tajaVisitor
from typing import List, Dict, Callable

class FuncDef:
    def __init__(self, name : str, args : List[str], body : List[Callable] ):
        self.name = name
        self.args = args
        self.body = body
    
    def __call__(self, *args, **kwargs):
        glob = kwargs['glob']

        loc = {}
        for arg, value in zip(self.args, args):
            loc[arg] = value
        
        for stmt in self.body:
            stmt(glob, loc)
            if '__return__' in loc:
                break
        
        return loc['__return__']

class globVisitor(tajaVisitor):
    def __init__(self, file_name):
        self.file_name = file_name
        self.func_table = set()

    def visitStart(self, ctx:tajaParser.StartContext) -> Dict[str, FuncDef]:
        glob = {}
        for func in ctx.func():
            func_def = self.visit(func)
            glob[func_def.name] = func_def

        return glob
    
    def visitFunction_definition(self, ctx:tajaParser.Function_definitionContext):
        name = ctx.name.text

        if name in self.func_table:
            raise KeyError(self.file_name+':'+str(ctx.name.line)+':'+str(ctx.name.column)+' function '+name+' is already defined')

        args = self.visit(ctx.args()) if ctx.args() else []
        
        self.id_table = set()
        for arg in args:
            self.id_table.add(arg)

        self.func_table.add(name)

        body = self.visit(ctx.statms())

        if not body:
            raise KeyError(self.file_name+':'+str(ctx.name.line)+':'+str(ctx.name.column)+' function '+id+' does not have a body')

        return FuncDef(
            name=name,
            args=args,
            body=body
        )

    def visitStatements(self, ctx:tajaParser.StatementsContext):
        return [self.visit(stmt) for stmt in ctx.statm()]

    def visitWhileStatement(self, ctx:tajaParser.WhileStatementContext):
        test = self.visit(ctx.cond)
        body = self.visit(ctx.statms())

        def __while__(glob, loc):
            while test(glob, loc):
                for stmt in body:
                    stmt(glob, loc)

        return __while__
        
    def visitArguments(self, ctx:tajaParser.ArgumentsContext):
        return [str(id) for id in ctx.ID()]

    def visitCall(self, ctx:tajaParser.CallContext):
        id = ctx.name.text
        if id not in self.func_table:
            raise KeyError(self.file_name+':'+str(ctx.name.line)+':'+str(ctx.name.column)+' function '+id+' is not defined')
        
        args = self.visit(ctx.exprs())

        return lambda glob, loc : glob[id](*[exp(glob, loc) for exp in args], glob=glob)

    def visitExpressions(self, ctx:tajaParser.ExpressionsContext):
        return [self.visit(x) for x in ctx.expr()]

    def visitAssignment(self, ctx:tajaParser.AssignmentContext):
        expr = self.visit(ctx.expr())
        id = str(ctx.ID())
        if id not in self.id_table:
            self.id_table.add(id)
        
        def __assign__(glob, loc):
            loc[id] = expr(glob, loc)
            
        return __assign__

    def visitAtomic(self, ctx:tajaParser.AtomicContext):
        if ctx.expr():
            return self.visit(ctx.expr())
        elif ctx.ID():
            id = str(ctx.ID())
            if id not in self.id_table:
                symbol = ctx.ID().getSymbol()
                raise KeyError(self.file_name+':'+str(symbol.line)+':'+str(symbol.column)+' variable '+id+' is not defined')
            return lambda glob, loc : loc[id]
        elif ctx.INT():
            value = int(str(ctx.INT()))
            return lambda glob, loc : value
        elif ctx.call():
            return self.visit(ctx.call())
        elif ctx.INPUT():
            return lambda glob, loc : int(input('>>> '))

    op_map = {
        '<' : lambda a, b : a <  b,
        '>' : lambda a, b : a >  b,
        '>=': lambda a, b : a >= b,
        '<=': lambda a, b : a <= b,
        '==': lambda a, b : a == b,
        '!=': lambda a, b : a != b,
        '+' : lambda a, b : a +  b,
        '-' : lambda a, b : a -  b,
        '*' : lambda a, b : a *  b,
        '/' : lambda a, b : a // b,
    }

    def visitExpression(self, ctx:tajaParser.ExpressionContext):
        left = self.visit(ctx.left)
        if ctx.right:
            right = self.visit(ctx.right)
            op = self.op_map[ctx.op.text]

            return lambda glob, loc : op(left(glob, loc), right(glob, loc))
        else:
             return left 

    def visitSumm(self, ctx:tajaParser.SummContext):
        left = self.visit(ctx.left)
        if ctx.right:
            right = self.visit(ctx.right)
            op = self.op_map[ctx.op.text]

            return lambda glob, loc : op(left(glob, loc), right(glob, loc))
        return left

    def visitMult(self, ctx:tajaParser.MultContext):
        left = self.visit(ctx.left)
        if ctx.right:
            right = self.visit(ctx.right)
            op = self.op_map[ctx.op.text]

            return lambda glob, loc : op(left(glob, loc), right(glob, loc))
        return left

    def visitDivide(self, ctx:tajaParser.DivideContext):
        left = self.visit(ctx.left)
        if ctx.right:
            right = self.visit(ctx.right)

            if right == 0: 
                raise ZeroDivisionError(self.file_name+':'+str(symbol.line)+':'+str(symbol.column)+' cannot divide by zero!')

            op = self.op_map[ctx.op.text]

            return lambda glob, loc : op(left(glob, loc), right(glob, loc))
        return left
