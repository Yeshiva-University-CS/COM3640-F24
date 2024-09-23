package edu.yu.pl;

import antlr4.ExprBaseVisitor;
import antlr4.ExprParser;

import java.util.HashMap;
import java.util.Map;

public class Executor extends ExprBaseVisitor<Object> {
    // The symbol table to store runtime values (our hack).
    private final Map<String, Object> symtab = new HashMap<String, Object>();

    @Override
    public Object visitAssign(ExprParser.AssignContext ctx) {
        String idName = ctx.IDENTIFIER().getText();
        Object value = visit(ctx.expr());  // compute the expression value
        symtab.put(idName, value);         // store it into the symbol table

        return value;
    }

    @Override
    public Object visitPrint(ExprParser.PrintContext ctx) {
        Object value = visit(ctx.expr());  // evaluate the expression
        System.out.println(value);         // print the result

        return null;
    }

    @Override
    public Object visitInt(ExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INTEGER().getText());  // integer value
    }

    @Override
    public Object visitId(ExprParser.IdContext ctx) {
        String id = ctx.IDENTIFIER().getText();

        if (symtab.containsKey(id)) {
            return symtab.get(id);  // value from symbol table
        } else return 0;              // dummy value
    }

    @Override
    public Object visitMulDiv(ExprParser.MulDivContext ctx) {
        int left = (Integer) visit(ctx.expr(0));  // left  child expression
        int right = (Integer) visit(ctx.expr(1));  // right child expression

        if (ctx.op.getType() == ExprParser.MUL) return left * right;
        else return left / right;
    }

    @Override
    public Object visitAddSub(ExprParser.AddSubContext ctx) {
        int left = (Integer) visit(ctx.expr(0));  // left  child expression
        int right = (Integer) visit(ctx.expr(1));  // right child expression

        if (ctx.op.getType() == ExprParser.ADD) return left + right;
        else return left - right;
    }

    @Override
    public Object visitParens(ExprParser.ParensContext ctx) {
        return visit(ctx.expr());  // return parenthesized expression value
    }
}
