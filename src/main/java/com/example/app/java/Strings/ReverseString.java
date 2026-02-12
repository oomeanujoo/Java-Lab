package com.example.app.java.Strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] str = "#$F#GGsfe3".toCharArray(); // this will convert it to the array
        rev(str);

        System.out.println("New String: " + new String(str));
    }

    public static void rev(char[] args) {
        // Two Pointer Approach

        int left = 0;
        int right = args.length - 1;

        while (left < right) {
            char temp = args[left];
            args[left] = args[right];
            args[right] = temp;

            left++;
            right--;
        }
    }

}
