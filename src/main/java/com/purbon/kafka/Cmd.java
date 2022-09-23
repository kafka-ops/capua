package com.purbon.kafka;

import com.purbon.kafka.policy.KafkaPolicyEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Cmd {

    public Cmd() {

    }

    public List<String> parse(String file) {
        List<String> errors = new ArrayList<>();
        try {
            String content = load(Path.of(file));
            errors = KafkaPolicyEngine.parse(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return errors;
    }

    private String load(Path filePath) throws IOException {
        return Files.readString(filePath);
    }


    public static void main(String[] args) throws IOException {

        String file = "kafka-policy.rego";
        Cmd cmd = new Cmd();
        cmd.parse(file);

        cmd.validate("input.json");
    }

    public void validate(String input) throws IOException {
       String content = load(Path.of(input));
       var vr = KafkaPolicyEngine.validate(content);
       System.out.println("Result: ");
       System.out.println(vr);
    }
}
