package com.example.app; // Specifies the correct package

import com.example.app.service.UserService; // Full package path for import

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.printAllUsers();
    }
}
