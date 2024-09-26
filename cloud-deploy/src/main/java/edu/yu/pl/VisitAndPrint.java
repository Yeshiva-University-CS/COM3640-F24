package edu.yu.pl;

import antlr4.CloudDeployBaseVisitor;
import antlr4.CloudDeployParser;

import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.antlr.v4.runtime.RuleContext;

public class VisitAndPrint extends CloudDeployBaseVisitor<Void> {
    private static final Logger logger = LogManager.getLogger(VisitAndPrint.class);
    private final boolean includeNodeText;
    private int level = 0;

    VisitAndPrint(boolean includeNodeText) {
        this.includeNodeText = includeNodeText;
    }

    @Override
    public Void visitChildren(RuleNode node) {
        try {
            level++;

            if (node instanceof RuleContext ruleContext) {
                String ruleName = CloudDeployParser.ruleNames[ruleContext.getRuleIndex()];
                // format the message
                logger.info("Visiting rule (L{}): {}", level, ruleName);
                if (includeNodeText) {
                    logger.info("Node text: {}", ruleContext.getText());
                }
            }

            // Recursively visit children
            return super.visitChildren(node);
        } finally {
            level--;
        }
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        try {
            level++;
            // Handle terminal nodes (leaf nodes)
            logger.info("Visiting terminal node (L{}): {}", level, node.getText());
            return null;
        }
        finally {
            level--;
        }
    }
}
