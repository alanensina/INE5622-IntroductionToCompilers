// Generated from taja.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tajaParser}.
 */
public interface tajaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tajaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(tajaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(tajaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(tajaParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(tajaParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(tajaParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(tajaParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(tajaParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(tajaParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#class_statements}.
	 * @param ctx the parse tree
	 */
	void enterClass_statements(tajaParser.Class_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#class_statements}.
	 * @param ctx the parse tree
	 */
	void exitClass_statements(tajaParser.Class_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(tajaParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(tajaParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(tajaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(tajaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(tajaParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(tajaParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(tajaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(tajaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#switchStatements}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatements(tajaParser.SwitchStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#switchStatements}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatements(tajaParser.SwitchStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(tajaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(tajaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#labelStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelStatement(tajaParser.LabelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#labelStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelStatement(tajaParser.LabelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(tajaParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(tajaParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(tajaParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(tajaParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#ternaryArguments}.
	 * @param ctx the parse tree
	 */
	void enterTernaryArguments(tajaParser.TernaryArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#ternaryArguments}.
	 * @param ctx the parse tree
	 */
	void exitTernaryArguments(tajaParser.TernaryArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#iterStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterStatement(tajaParser.IterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#iterStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterStatement(tajaParser.IterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(tajaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(tajaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(tajaParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(tajaParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#assignment_typed}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_typed(tajaParser.Assignment_typedContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#assignment_typed}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_typed(tajaParser.Assignment_typedContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#assignment_empty}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_empty(tajaParser.Assignment_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#assignment_empty}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_empty(tajaParser.Assignment_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#assignment_call}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_call(tajaParser.Assignment_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#assignment_call}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_call(tajaParser.Assignment_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(tajaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(tajaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#assignment_change}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_change(tajaParser.Assignment_changeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#assignment_change}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_change(tajaParser.Assignment_changeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(tajaParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(tajaParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(tajaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(tajaParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#call_arguments}.
	 * @param ctx the parse tree
	 */
	void enterCall_arguments(tajaParser.Call_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#call_arguments}.
	 * @param ctx the parse tree
	 */
	void exitCall_arguments(tajaParser.Call_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(tajaParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(tajaParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(tajaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(tajaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#summ}.
	 * @param ctx the parse tree
	 */
	void enterSumm(tajaParser.SummContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#summ}.
	 * @param ctx the parse tree
	 */
	void exitSumm(tajaParser.SummContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(tajaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(tajaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link tajaParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(tajaParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link tajaParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(tajaParser.AtomicContext ctx);
}