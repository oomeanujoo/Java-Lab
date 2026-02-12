package com.example.app.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 6, 3, 7);

        List<Integer> even = nums.stream()
                .filter((e) -> e % 2 == 0)
                .collect(Collectors.toList());


        System.out.println("nums" + nums);
        System.out.println("even" + even);
    }


}
