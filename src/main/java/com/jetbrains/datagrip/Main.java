package com.jetbrains.datagrip;

import org.antlr.SqlLexer;
import org.antlr.SqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main( String[] args) throws Exception
    {
        System.out.println(transpile("SELECT name, surname FROM collection"));
        System.out.println(transpile("SELECT * FROM collection LIMIT 10"));
        System.out.println(transpile("SELECT * FROM collection OFFSET 5"));
        System.out.println(transpile("SELECT * FROM collection LIMIT 10 OFFSET 5"));
        System.out.println(transpile("SELECT * FROM collection OFFSET 10 LIMIT 5"));
        System.out.println(transpile("SELECT * FROM collection OFFSET 5 LIMIT 10"));
        System.out.println(transpile("SELECT * FROM customers WHERE age > 22 AND name = 'Vasya'"));
        System.out.println(transpile("SELECT * FROM customers WHERE age < 22 AND age > 10 AND name != 'Vasya' AND name != 'Peter'"));
        System.out.println(transpile("SELECT * FROM customers WHERE name = 'Vasya'"));
    }

    public static String transpile(String query) {
        SqlLexer lexer = new SqlLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        parser.removeErrorListeners();

        SqlVisitorImpl visitor = new SqlVisitorImpl();
        return visitor.visit(parser.sql_script());
    }
}
