package com.purbon.kafka.policy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {

    private String name;
    private int partitions;
    private short replicationFactor;

    private HashMap<String, String> config;

    public Topic(String name, int partitions, short replicationFactor) {
        this(name, partitions, replicationFactor, new HashMap<>());
    }

    @Override
    public String toString() {
        return name;
    }
}
