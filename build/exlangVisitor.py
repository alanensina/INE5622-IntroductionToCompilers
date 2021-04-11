# Generated from exlang.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .exlangParser import exlangParser
else:
    from exlangParser import exlangParser

# This class defines a complete generic visitor for a parse tree produced by exlangParser.

class exlangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by exlangParser#start.
    def visitStart(self, ctx:exlangParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#function_definition.
    def visitFunction_definition(self, ctx:exlangParser.Function_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#arguments.
    def visitArguments(self, ctx:exlangParser.ArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#statements.
    def visitStatements(self, ctx:exlangParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#statement.
    def visitStatement(self, ctx:exlangParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#switchStatement.
    def visitSwitchStatement(self, ctx:exlangParser.SwitchStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#labelStatement.
    def visitLabelStatement(self, ctx:exlangParser.LabelStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#jumpStatement.
    def visitJumpStatement(self, ctx:exlangParser.JumpStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#selectionStatement.
    def visitSelectionStatement(self, ctx:exlangParser.SelectionStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#iterStatement.
    def visitIterStatement(self, ctx:exlangParser.IterStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#whileStatement.
    def visitWhileStatement(self, ctx:exlangParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#assignment_typed.
    def visitAssignment_typed(self, ctx:exlangParser.Assignment_typedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#assignment.
    def visitAssignment(self, ctx:exlangParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#types.
    def visitTypes(self, ctx:exlangParser.TypesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#call.
    def visitCall(self, ctx:exlangParser.CallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#expressions.
    def visitExpressions(self, ctx:exlangParser.ExpressionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#expression.
    def visitExpression(self, ctx:exlangParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#arguments_exp.
    def visitArguments_exp(self, ctx:exlangParser.Arguments_expContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#summ.
    def visitSumm(self, ctx:exlangParser.SummContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#mult.
    def visitMult(self, ctx:exlangParser.MultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#arguments_repeat.
    def visitArguments_repeat(self, ctx:exlangParser.Arguments_repeatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by exlangParser#atomic.
    def visitAtomic(self, ctx:exlangParser.AtomicContext):
        return self.visitChildren(ctx)



del exlangParser