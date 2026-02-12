package com.example.app.java;

import java.util.*;
import java.lang.*;

import java.util.stream.*;
import java.util.function.Function;

class charFrequency {
    public static void main(String[] args) throws java.lang.Exception {
        String input = "AaaBbbCccDddEee";
        IntStream stream = input.chars();
        Map<Character, Long> charlongmap = stream.mapToObj((c) -> (char) c)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));
        System.out.println(charlongmap);
    }
}