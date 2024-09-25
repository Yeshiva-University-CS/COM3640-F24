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

    @Override
    public Void visitChildren(RuleNode node) {
        // Cast the RuleNode to RuleContext to access rule-specific information
        if (node instanceof RuleContext) {
            RuleContext ruleContext = (RuleContext) node;
            String ruleName = CloudDeployParser.ruleNames[ruleContext.getRuleIndex()];
            logger.info("Visiting rule: " + ruleName);
            logger.info("Node text: " + ruleContext.getText());
        }

        // Recursively visit children
        return super.visitChildren(node);
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        // Handle terminal nodes (leaf nodes)
        logger.info("Visiting terminal node: " + node.getText());
        return null;
    }
}
