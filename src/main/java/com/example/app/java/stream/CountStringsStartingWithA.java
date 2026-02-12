package com.example.app.java.stream;

import java.util.Arrays;
import java.util.List;

public class CountStringsStartingWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anuj", "aman");

        long count = names.stream()
                .map(String::toLowerCase)
                .filter(e -> e.startsWith("a"))
                .count();
        System.out.println("Total count: " + count);

    }
}
