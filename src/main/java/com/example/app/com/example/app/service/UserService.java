package com.example.app.service; // Update this line




import java.util.List;

import com.example.app.model.User;
import com.example.app.repository.UserRepository;



public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void printAllUsers() {
        List<User> users = userRepository.getAllUsers();

        // Print header without ID
        System.out.printf("%-20s %-30s%n", "Username", "Email");
        System.out.println("-----------------------------------------------");

        // Print each user's details without ID
        for (User user : users) {
            System.out.printf("%-20s %-30s%n", user.getUsername(), user.getEmail());
        }
    }
}
