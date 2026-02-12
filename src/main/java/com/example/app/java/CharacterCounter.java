package com.example.app.java;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static void main(String[] args) {
        // Step 1: Original string
        String str = "AaaBbbCccDddEee";

        // Step 2: Convert string to uppercase → "AAABBBCCCDDDEEE"
        str = str.toUpperCase();

        // Step 3: Create a HashMap to store character and its count
        // Format: { 'A' = 3, 'B' = 3, ... }
        Map<Character, Integer> charCount = new HashMap<>();

        // Step 4: Convert the string to an array of characters
        // Debug View: ['A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', ...]
        char[] chars = str.toCharArray();

        // Step 5: Loop over the char array
        for (char ch : chars) {
            // DEBUG: What is 'ch' right now?
            // First iteration: ch = 'A'
            // Second iteration: ch = 'A'
            // Third iteration: ch = 'A'
            // Then: 'B', 'B', 'B' and so on...

            if (charCount.containsKey(ch)) {
                // If map already has this character (like 'A'),
                // then get its count, increase by 1, and update the map
                int oldCount = charCount.get(ch); // e.g., 2
                charCount.put(ch, oldCount + 1);   // now it's 3
            } else {
                // If it's the first time we see this character (like 'A'),
                // then add it to the map with count = 1
                charCount.put(ch, 1);
            }

            // DEBUG: Print map after each step
            // Example after 3 A's: { A=3 }
            // After 3 B's: { A=3, B=3 }
        }

        // Step 6: Print final result
        for (Character ch : charCount.keySet()) {
            // keySet() gives: [A, B, C, D, E]
            // get(ch) gives:  charCount.get('A') → 3
            System.out.println(ch + " : " + charCount.get(ch));
        }

        // Final Output:
        // A : 3
        // B : 3
        // C : 3
        // D : 3
        // E : 3
    }
}
