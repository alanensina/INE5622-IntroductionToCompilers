// Generated from exlang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exlangParser}.
 */
public interface exlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exlangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(exlangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(exlangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(exlangParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(exlangParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(exlangParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(exlangParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#class_statements}.
	 * @param ctx the parse tree
	 */
	void enterClass_statements(exlangParser.Class_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#class_statements}.
	 * @param ctx the parse tree
	 */
	void exitClass_statements(exlangParser.Class_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(exlangParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(exlangParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(exlangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(exlangParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(exlangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(exlangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(exlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(exlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#switchStatements}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatements(exlangParser.SwitchStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#switchStatements}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatements(exlangParser.SwitchStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(exlangParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(exlangParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#labelStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelStatement(exlangParser.LabelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#labelStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelStatement(exlangParser.LabelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(exlangParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(exlangParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(exlangParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(exlangParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#ternaryArguments}.
	 * @param ctx the parse tree
	 */
	void enterTernaryArguments(exlangParser.TernaryArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#ternaryArguments}.
	 * @param ctx the parse tree
	 */
	void exitTernaryArguments(exlangParser.TernaryArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#iterStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterStatement(exlangParser.IterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#iterStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterStatement(exlangParser.IterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(exlangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(exlangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(exlangParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(exlangParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#assignment_typed}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_typed(exlangParser.Assignment_typedContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#assignment_typed}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_typed(exlangParser.Assignment_typedContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#assignment_empty}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_empty(exlangParser.Assignment_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#assignment_empty}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_empty(exlangParser.Assignment_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(exlangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(exlangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#assignment_change}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_change(exlangParser.Assignment_changeContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#assignment_change}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_change(exlangParser.Assignment_changeContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(exlangParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(exlangParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(exlangParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(exlangParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(exlangParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(exlangParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(exlangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(exlangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#arguments_exp}.
	 * @param ctx the parse tree
	 */
	void enterArguments_exp(exlangParser.Arguments_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#arguments_exp}.
	 * @param ctx the parse tree
	 */
	void exitArguments_exp(exlangParser.Arguments_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#summ}.
	 * @param ctx the parse tree
	 */
	void enterSumm(exlangParser.SummContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#summ}.
	 * @param ctx the parse tree
	 */
	void exitSumm(exlangParser.SummContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(exlangParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(exlangParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#arguments_repeat}.
	 * @param ctx the parse tree
	 */
	void enterArguments_repeat(exlangParser.Arguments_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#arguments_repeat}.
	 * @param ctx the parse tree
	 */
	void exitArguments_repeat(exlangParser.Arguments_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link exlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(exlangParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(exlangParser.AtomicContext ctx);
}