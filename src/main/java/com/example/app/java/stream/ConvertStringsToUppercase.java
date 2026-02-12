package com.example.app.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToUppercase {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("apple", "rose", "guava");

        List<String> uc = ls.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("before" + ls);
        System.out.println("after" + uc);
    }


}
