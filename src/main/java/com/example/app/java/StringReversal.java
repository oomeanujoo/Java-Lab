package com.example.app.java;

public class StringReversal {
    public static void main(String[] args) {
        String original = "hello";
        String reverse = reverseStringWithStringBuilder(original);
        System.out.println(reverse);
    }

    public static String reverseStringWithStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
