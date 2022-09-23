package com.purbon.kafka.policy;


import com.purbon.kafka.policy.rules.ComparableRule;
import lombok.Getter;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class RegoRuleListener extends RegoParserBaseListener {

    Logger logger = LoggerFactory.getLogger(RegoRuleListener.class);

    @Getter
    private Stack<Block> blocks;
    private Block current;
    private ComparableRule policyRule;
    private StringFunctionRule functionRule;

    public RegoRuleListener() {
        blocks = new Stack<>();
        current = new Block();
        policyRule = null;
        functionRule = null;
    }

    @Override
    public void enterRuleHead(RegoParser.RuleHeadContext ctx) {

        var node = ctx.Name();
        var ruleName = node.getText();
        var body = ctx.getText();

        logger.debug("rule.name = %s, rule.head = %s%n", ruleName, body);
        current = new Block();
        current.setType(ruleName);
    }

    @Override
    public void exitRuleHead(RegoParser.RuleHeadContext ctx) {
        blocks.add(current);
    }

    @Override
    public void enterRuleBody(RegoParser.RuleBodyContext ctx) {
       logger.debug("body: "+ctx.getText());
    }

    @Override
    public void enterQuery(RegoParser.QueryContext ctx) {
        logger.debug("query: "+ctx.getText());
    }

    @Override
    public void enterLiteral(RegoParser.LiteralContext ctx) {
       logger.debug("literal: "+ctx.getText());
    }

    @Override
    public void enterLiteralExpr(RegoParser.LiteralExprContext ctx) {
        logger.debug("literal.expr = "+ctx.getText());
    }

    @SneakyThrows
    @Override
    public void enterExprTerm(RegoParser.ExprTermContext ctx) {
       logger.debug("expression.term = "+ctx.getText());

       if (ctx.relationExpr().size() > 1) {
           String startToken = ctx.start.getText();
           String endToken = ctx.relationExpr(0).stop.getText();

           var terminalRuleFactory = EngineRuleFactory
                   .getInstance()
                   .create(startToken);

           policyRule = terminalRuleFactory.create(endToken);
       }

       var operators = ctx.RelationOperator();
       if (operators.size() > 0) {
           logger.debug("operators.count = " + operators.size() + "; op = " + operators.get(0).getText());
           policyRule.setOperation(operators.get(0).getText());
       }
    }

    @Override
    public void exitExprTerm(RegoParser.ExprTermContext ctx) {
        if (policyRule != null && !policyRule.isEmpty()) {
            current.addAction(policyRule);
            policyRule = null;
        }
    }

    @Override
    public void enterRelationExpr(RegoParser.RelationExprContext ctx) {
        String literal = ctx.getText();
        if (literal.contains("(") && literal.contains(")")) {
            return;
        }
        logger.debug("relation.expr = "+literal);
        if (policyRule != null) {
            if (!policyRule.getLiteral().isBlank()) {
                if (isNumeric(literal)) {
                   policyRule.setObjective(Double.parseDouble(literal));
                } else {
                    policyRule.setObjective(literal);
                }
            }
        } else if (functionRule != null) {
            functionRule.getArguments().add(literal);
        }
    }

    private boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    @Override
    public void enterFunctionCall(RegoParser.FunctionCallContext ctx) {
       logger.debug("function.call: "+ctx.getText());
       functionRule = new StringFunctionRule();
       policyRule = null;
    }

    @Override
    public void exitFunctionCall(RegoParser.FunctionCallContext ctx) {
        current.addAction(functionRule);
        functionRule = null;
    }

    @Override
    public void enterRef(RegoParser.RefContext ctx) {
       logger.debug("ref: "+ctx.getText());
       if (functionRule != null) {
           if (functionRule.getFunctionName().isEmpty()) {
               functionRule.setFunctionName(ctx.getText());
           }
       }
    }
}



