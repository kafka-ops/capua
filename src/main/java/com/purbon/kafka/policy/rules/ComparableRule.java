package com.purbon.kafka.policy.rules;

public interface ComparableRule<T> extends Rule {

    void setOperation(String op);

    void setObjective(T obj);

    boolean isValid(Comparable<T> value);
}
