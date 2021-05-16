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
        return self.visitChildren(ctx) # OK


    # Visit a parse tree produced by tajaParser#function_definition.
    def visitFunction_definition(self, ctx:tajaParser.Function_definitionContext):
        return self.visitChildren(ctx) # OK


    # Visit a parse tree produced by tajaParser#arguments.
    def visitArguments(self, ctx:tajaParser.ArgumentsContext):
        return self.visitChildren(ctx) # ok


    # Visit a parse tree produced by tajaParser#statements.
    def visitStatements(self, ctx:tajaParser.StatementsContext):
        return self.visitChildren(ctx) # ok


    # Visit a parse tree produced by tajaParser#whileStatement.
    def visitWhileStatement(self, ctx:tajaParser.WhileStatementContext):
        return self.visitChildren(ctx) # OK


    # Visit a parse tree produced by tajaParser#assignment.
    def visitAssignment(self, ctx:tajaParser.AssignmentContext):
        return self.visitChildren(ctx) # ok


    # Visit a parse tree produced by tajaParser#call.
    def visitCall(self, ctx:tajaParser.CallContext):
        return self.visitChildren(ctx) # ok


    # Visit a parse tree produced by tajaParser#expressions.
    def visitExpressions(self, ctx:tajaParser.ExpressionsContext):
        return self.visitChildren(ctx) # ok


    # Visit a parse tree produced by tajaParser#summ.
    def visitSumm(self, ctx:tajaParser.SummContext):
        return self.visitChildren(ctx) # ok


    # Visit a parse tree produced by tajaParser#mult.
    def visitMult(self, ctx:tajaParser.MultContext):
        return self.visitChildren(ctx) # ok

    # Visit a parse tree produced by tajaParser#divide.
    def visitDivide(self, ctx:tajaParser.DivideContext):
        return self.visitChildren(ctx) # ok    


    # Visit a parse tree produced by tajaParser#atomic.
    def visitAtomic(self, ctx:tajaParser.AtomicContext):
        return self.visitChildren(ctx) # ok


del tajaParser