package com.example.app.java;

import java.util.*;


public class LargestAndSmallestNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2, 6};
        int n = arr.length;
        Map<String, Integer> result = new HashMap<>();

        result = findMethod(n, arr);

    }

    public static Map<String, Integer> findMethod(int n, int[] arr) {
        int max = arr[0];
        int min = arr[0];

        Map<String, Integer> val = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        val.put("Max", max);
        val.put("Min", min);

        return val;

    }


}
