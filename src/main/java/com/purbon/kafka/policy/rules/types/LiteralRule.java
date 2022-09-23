package com.purbon.kafka.policy.rules.types;

import lombok.Data;

@Data
public abstract class LiteralRule<T> implements ComparableRule<T> {

    private String literal = "";
    private String operation = "";
    private T objective = null;

    @Override
    public boolean isValid(Comparable<T> value) {
        boolean isValid;
        switch (operation) {
            case "==":
                isValid = (value.compareTo(objective) == 0);
                break;
            case "!=":
                isValid = (value.compareTo(objective) != 0);
                break;
            case ">":
                isValid = (value.compareTo(objective) > 0);
                break;
            case "<":
                isValid = (value.compareTo(objective) < 0);
                break;
            case ">=":
                isValid = (value.compareTo(objective) >= 0);
                break;
            case "<=":
                isValid = (value.compareTo(objective) <= 0);
                break;
            default:
                throw new RuntimeException("Invalid operation");
        }
      return isValid;
    }

    @Override
    public String toString() {
        return "( " + literal + " " + operation + " " + objective + " )";
    }

    public boolean isEmpty() {
        return literal.isEmpty() || operation.isEmpty() || objective == null;
    }
}
