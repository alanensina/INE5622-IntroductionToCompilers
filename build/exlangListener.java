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
	 * Enter a parse tree produced by {@link exlangParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(exlangParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link exlangParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(exlangParser.While_stmtContext ctx);
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