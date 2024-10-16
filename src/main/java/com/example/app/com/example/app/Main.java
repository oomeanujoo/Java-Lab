package com.example.app; // Add this line to specify the correct package

import com.example.app.service.UserService; // Use the full package path for the import

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.printAllUsers();
    }
}
