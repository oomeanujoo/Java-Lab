package com.example.app.java;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueElementsFromArray {

    public static void main(String[] args) {

        // Step 1: Sample input array
        int[] arr = {1, 2, 3, 2, 4, 3, 5};

        // Step 2: Create a map to count occurrences
        Map<Integer, Integer> countMap = new HashMap<>();

        // Step 3: Count each element in the array
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        // Step 4: Print only elements that appeared once
        System.out.println("Unique elements:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
