package com.jetbrains.datagrip;


import org.antlr.SqlParser;
import org.antlr.SqlVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class SqlVisitorImpl implements SqlVisitor<String> {
    private static final String currentDb = "db";
    private static final Map<String, String> compareFns;

    static {
        Map<String, String> compareFnsTemp = new HashMap<>();
        compareFnsTemp.put("<", "$lt");
        compareFnsTemp.put("<=", "$lte");
        compareFnsTemp.put(">", "$gt");
        compareFnsTemp.put(">=", "$gte");
        compareFnsTemp.put("=", "$eq");
        compareFnsTemp.put("!=", "$neq");
        compareFnsTemp.put("<>", "$neq");
        compareFns = Collections.unmodifiableMap(compareFnsTemp);
    }

    public String visitSql_script(SqlParser.Sql_scriptContext ctx) {
        return visit(ctx.sqlStatement(0));
    }

    public String visitSqlStatement(SqlParser.SqlStatementContext ctx) {
        return visitSelectStatement(ctx.selectStatement());
    }

    public String visitSelectStatement(SqlParser.SelectStatementContext ctx) {
        String tableName = ctx.fromClause().tableList().ID(0).getText();

        String projection = visitSelectElements(ctx.selectElements());
        String filter = visitFromClause(ctx.fromClause());
        StringBuilder res = new StringBuilder();
        res.append(currentDb).append(".").append(tableName);
        res.append(".find(").append(filter);
        if (projection != null) {
            res.append(", ");
            res.append(projection);
        }
        res.append(")");
        if (ctx.limitClause() != null) {
            res.append(visitLimitClause(ctx.limitClause()));
        }
        return res.toString();
    }

    public String visitSelectElements(SqlParser.SelectElementsContext ctx) {
        if (ctx.star != null)
            return null;
        StringBuilder res = new StringBuilder();
        res.append("{");
        for (int i = 0; i < ctx.selectElement().size(); ++i) {
            if (i > 0)
                res.append(", ");
            res.append(visit(ctx.selectElement(i))).append(": 1");
        }
        res.append("}");

        return res.toString();
    }

    public String visitFromClause(SqlParser.FromClauseContext ctx) {
        StringBuilder res = new StringBuilder();
        res.append("{");
        if (ctx.whereExpr != null) {
            res.append(visit(ctx.whereExpr));
        }
        res.append("}");
        return res.toString();
    }

    public String visitTableList(SqlParser.TableListContext ctx) {
        //todo
        return null;
    }

    public String visitLimitClause(SqlParser.LimitClauseContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.offset != null) {
            sb.append(".skip(").append(ctx.offset.getText()).append(")");
        }
        if (ctx.limit != null) {
            sb.append(".limit(").append(ctx.limit.getText()).append(")");
        }
        return sb.toString();
    }

    public String visitSelectElement(SqlParser.SelectElementContext ctx) {
        return ctx.getText();
    }

    public String visitOrderByClause(SqlParser.OrderByClauseContext ctx) {
        return null;
    }

    public String visitOrderByExpression(SqlParser.OrderByExpressionContext ctx) {
        return null;
    }

    public String visitNotExpression(SqlParser.NotExpressionContext ctx) {
        return null;
    }

    public String visitLogicalExpression(SqlParser.LogicalExpressionContext ctx) {
        StringBuilder sb = new StringBuilder();
        switch (ctx.logicalOperator().getText()) {
            case "AND":

                sb.append(visit(ctx.expression(0)));
                sb.append(", ");
                sb.append(visit(ctx.expression(1)));
                break;
            //todo through $or $not
            default:
                throw new RuntimeException("Other logical operation is not supported");
        }
        return sb.toString();
    }

    public String visitPredicateExpression(SqlParser.PredicateExpressionContext ctx) {
        return visitPredicate(ctx.predicate());
    }

    public String visitPredicate(SqlParser.PredicateContext ctx) {
        String op = visitComparisonOperator(ctx.comparisonOperator());

        String left = visit(ctx.left);
        String right = visit(ctx.right);
        StringBuilder sb = new StringBuilder();
        sb.append(left).append(": {");
        sb.append(op).append(": ").append(right);
        sb.append("}");
        return sb.toString();
    }

    public String visitExpressionAtom(SqlParser.ExpressionAtomContext ctx) {
        if (ctx.constant() != null)
            return ctx.constant().getText();
        else //if(ctx.ID() != null)
            return ctx.ID().getText();
        //return null;
    }

    public String visitComparisonOperator(SqlParser.ComparisonOperatorContext ctx) {
        return compareFns.get(ctx.getText());
    }

    public String visitLogicalOperator(SqlParser.LogicalOperatorContext ctx) {
        return ctx.getText();
    }

    public String visitConstant(SqlParser.ConstantContext ctx) {
        return ctx.getText();
    }

    public String visit(ParseTree parseTree) {
        return parseTree.accept(this);
    }

    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    public String visitTerminal(TerminalNode terminalNode) {
        return terminalNode.getText();
    }

    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
