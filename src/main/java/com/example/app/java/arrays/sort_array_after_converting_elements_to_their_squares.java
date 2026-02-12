package com.example.app.java.arrays;

import java.util.Arrays;

public class sort_array_after_converting_elements_to_their_squares {
    public static void main(String[] args) {
        int arr[] = {-6, -3, -1, 2, 4, 5};
        int result[] = squaringArray(arr);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    public static int[] squaringArray(int arr[]) {
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }
}
