package com.example.app.java;

public class StaticSetupExample {
    private static int count;

    // 🛠️ This is the "static constructor" equivalent in Java:
    static {
        count = 10;
        System.out.println("Static block ran: count = " + count);
    }

    public static void main(String[] args) {
        System.out.println("Count is " + count);
    }
}
