package com.example.app.java;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "I am Test Engineer";
        String reversed = reverseWords(sentence);
        System.out.println(reversed);  // Expected: "Engineer Test am I"
    }

    public static String reverseWords(String input) {

        // Step 1: Split the sentence into words
        String[] arr = input.split(" ");
        String result = "";

        // Step 2: Loop backward through the array
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];

            // Add a space if this is not the last word
            if (i != 0) {
                result = result + " ";
            }
        }

        // Step 3: Return the reversed string
        return result;
    }
}
