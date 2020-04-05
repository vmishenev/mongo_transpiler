// Generated from /media/vadim/store2/csc/jb/translator/src/main/java/Sql.g4 by ANTLR 4.8
package org.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(SqlParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(SqlParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(SqlParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(SqlParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(SqlParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(SqlParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(SqlParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(SqlParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SqlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SqlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SqlParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SqlParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(SqlParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(SqlParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtom(SqlParser.ExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtom(SqlParser.ExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SqlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SqlParser.ConstantContext ctx);
}