package com.purbon.kafka.policy;

import com.purbon.kafka.policy.rules.ComparableRule;
import com.purbon.kafka.policy.rules.Rule;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StringFunctionRule implements ComparableRule<String> {

    private String functionName = "";
    private List<String> arguments = new ArrayList<>();

    @Override
    public void setOperation(String op) {
        this.functionName = op;
    }

    @Override
    public void setObjective(String obj) {

    }

    @Override
    public boolean isValid(Comparable<String> value) {
        boolean isValid;
        switch (functionName) {
            case "startswith":
                String other = arguments.get(1).replace("\"", "");
                isValid = value.toString().startsWith(other);
                break;
            default:
                throw new RuntimeException("Non supported function "+functionName);

        }
        return isValid;
    }

    @Override
    public String getLiteral() {
        return this.functionName;
    }

    @Override
    public boolean isEmpty() {
        return functionName.isEmpty();
    }
}
