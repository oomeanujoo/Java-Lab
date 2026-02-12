package com.example.app.java;

public class ReverseStringUsingBuilder {

    public static void main(String[] args) {
        String sentence = "I am Test Engineer";
        String reversed = reverseWords(sentence);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseWords(String input) {
        // Step 1: Split the input into words
        String[] words = input.split(" ");

        // Step 2: Use StringBuilder to build the reversed sentence
        StringBuilder reversed = new StringBuilder();

        // Step 3: Loop from the end of the array to the beginning
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);  // Append the word

            // Add a space after the word, except after the last one
            if (i != 0) {
                reversed.append(" ");
            }
        }

        // Step 4: Convert StringBuilder to String and return
        return reversed.toString();
    }
}
