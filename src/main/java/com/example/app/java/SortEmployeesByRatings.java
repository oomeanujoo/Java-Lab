package com.example.app.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesByRatings {
    // 🔹 Employee class with name and rating
    static class Employee {
        private String name;
        private int rating;

        // Constructor
        public Employee(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getRating() {
            return rating;
        }

        // For printing nicely
        @Override
        public String toString() {
            return name + " (" + rating + ")";
        }
    }

    public static void main(String[] args) {

        // 🔹 Step 1: Create a list of employees (with generics)
        // ✅ Recommended way (type-safe)
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 4),
                new Employee("Bob", 2),
                new Employee("Charlie", 5),
                new Employee("David", 3)
        );

        // ❗️Alternate way WITHOUT generics (not recommended, but valid for learning)
        // List employees = Arrays.asList(
        //     new Employee("Alice", 4),
        //     new Employee("Bob", 2),
        //     new Employee("Charlie", 5),
        //     new Employee("David", 3)
        // );

        // 🔹 Step 2: Sort employees using Java 8 Stream API by rating
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getRating)) // ascending order
                .collect(Collectors.toList());

        // 🔹 Step 3: Print sorted employees
        System.out.println("Employees sorted by rating:");
        sortedEmployees.forEach(System.out::println);
    }
}
