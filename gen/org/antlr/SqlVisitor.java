// Generated from /media/vadim/store2/csc/jb/translator/src/main/java/Sql.g4 by ANTLR 4.8
package org.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(SqlParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SqlParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableList(SqlParser.TableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(SqlParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(SqlParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SqlParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(SqlParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(SqlParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtom(SqlParser.ExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(SqlParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SqlParser.ConstantContext ctx);
}