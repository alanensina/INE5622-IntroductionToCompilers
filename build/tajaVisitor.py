# Generated from taja.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .tajaParser import tajaParser
else:
    from tajaParser import tajaParser

# This class defines a complete generic visitor for a parse tree produced by tajaParser.

class tajaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by tajaParser#start.
    def visitStart(self, ctx:tajaParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#function_definition.
    def visitFunction_definition(self, ctx:tajaParser.Function_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#function_call.
    def visitFunction_call(self, ctx:tajaParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#class_definition.
    def visitClass_definition(self, ctx:tajaParser.Class_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#class_statements.
    def visitClass_statements(self, ctx:tajaParser.Class_statementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#constructor.
    def visitConstructor(self, ctx:tajaParser.ConstructorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#arguments.
    def visitArguments(self, ctx:tajaParser.ArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#statements.
    def visitStatements(self, ctx:tajaParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#statement.
    def visitStatement(self, ctx:tajaParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#switchStatements.
    def visitSwitchStatements(self, ctx:tajaParser.SwitchStatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#switchStatement.
    def visitSwitchStatement(self, ctx:tajaParser.SwitchStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#labelStatement.
    def visitLabelStatement(self, ctx:tajaParser.LabelStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#jumpStatement.
    def visitJumpStatement(self, ctx:tajaParser.JumpStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#selectionStatement.
    def visitSelectionStatement(self, ctx:tajaParser.SelectionStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#ternaryArguments.
    def visitTernaryArguments(self, ctx:tajaParser.TernaryArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#iterStatement.
    def visitIterStatement(self, ctx:tajaParser.IterStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#whileStatement.
    def visitWhileStatement(self, ctx:tajaParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#assignments.
    def visitAssignments(self, ctx:tajaParser.AssignmentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#assignment_typed.
    def visitAssignment_typed(self, ctx:tajaParser.Assignment_typedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#assignment_empty.
    def visitAssignment_empty(self, ctx:tajaParser.Assignment_emptyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#assignment_call.
    def visitAssignment_call(self, ctx:tajaParser.Assignment_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#assignment.
    def visitAssignment(self, ctx:tajaParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#assignment_change.
    def visitAssignment_change(self, ctx:tajaParser.Assignment_changeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#types.
    def visitTypes(self, ctx:tajaParser.TypesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#call.
    def visitCall(self, ctx:tajaParser.CallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#call_arguments.
    def visitCall_arguments(self, ctx:tajaParser.Call_argumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#expressions.
    def visitExpressions(self, ctx:tajaParser.ExpressionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#expression.
    def visitExpression(self, ctx:tajaParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#summ.
    def visitSumm(self, ctx:tajaParser.SummContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#mult.
    def visitMult(self, ctx:tajaParser.MultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by tajaParser#atomic.
    def visitAtomic(self, ctx:tajaParser.AtomicContext):
        return self.visitChildren(ctx)



del tajaParser