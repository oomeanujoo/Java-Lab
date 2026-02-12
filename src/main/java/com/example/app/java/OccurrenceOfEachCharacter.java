package com.example.app.java;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachCharacter {

    // Main method — entry point of the program
    public static void main(String[] args) {
        String input = "function";  // You can change this to any input
        countingMethod(input);      // Calling the method to count characters
    }

    /**
     * This method counts the occurrence of each character in a given string.
     * It prints each character along with how many times it appears.
     *
     * Example:
     * Input: "function"
     * Output:
     * f,1
     * u,1
     * n,2
     * c,1
     * t,1
     * i,1
     * o,1
     */
    public static void countingMethod(String input) {
        // Step 1: Create a map to store each character and its count
        Map<Character, Integer> charCount = new HashMap<>();

        // Step 2: Convert the input string into a character array
        char[] inputArr = input.toCharArray();

        // Step 3: Loop through each character in the array
        for (char val : inputArr) {

            // Flag to check if the character is already in the map
            boolean found = false;

            // Step 4: Go through each entry in the map (key-value pairs)
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {

                // If character is already present in map, update its count
                if (val == entry.getKey()) {
                    charCount.put(val, entry.getValue() + 1);
                    found = true;  // Mark as found
                    break;         // Exit the inner loop early — we found the character
                }
            }

            // Step 5: If character was not found in map, add it with count 1
            if (!found) {
                charCount.put(val, 1);
            }
        }

        // Step 6: Print each character and its count from the map
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
