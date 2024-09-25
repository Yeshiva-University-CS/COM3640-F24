package edu.yu.pl;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import antlr4.CloudDeployLexer;
import antlr4.CloudDeployParser;

import java.io.FileInputStream;
import java.io.IOException;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        if (args.length != 1) {
            logger.error("Usage: java -jar cloud-deploy.jar <source-file>");
            System.exit(-1);
        }

        String sourceFileName = args[0];
        
        CharStream chars = getCharStream(sourceFileName);
        if (chars == null) {
            logger.error("Source file error: " + sourceFileName);
            System.exit(-1);
        }

        // Create a lexer which scans the character stream
        // to create a token stream.
        var lexer = new CloudDeployLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser which parses the token stream
        // to create a parse tree.
        var parser = new CloudDeployParser(tokens);
        ParseTree tree = parser.deployment();

        // Visit and Print
        logger.info("\nVisitation:");
        var visitor = new VisitAndPrint();
        visitor.visit(tree);

        // Execution
        logger.info("\nExecution:");
        var executor = new Executor();
        var network = executor.visit(tree);
        logger.info("Network: " + network);
    }

    public static CharStream getCharStream(String sourceFileName) {
        try {

            // Create the input stream.s
            FileInputStream source = new FileInputStream(sourceFileName);

            // Create the character stream from the input stream.
            return CharStreams.fromStream(source);

        } catch (IOException ex) {
            return null;
        }
    }
}
