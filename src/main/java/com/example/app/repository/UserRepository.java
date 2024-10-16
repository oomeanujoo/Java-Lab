package com.example.app.repository; // Update this line


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.app.database.DatabaseConnection;
import com.example.app.model.User;



public class UserRepository {
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users"; // Ensure this matches your actual table structure

        try (Connection conn = DatabaseConnection.getConnection(); // Using the static method here
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("id"); // Adjust these column names as necessary
                String username = rs.getString("username");
                String email = rs.getString("email");
                users.add(new User(id, username, email)); // Create new User object and add to the list
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
        return users; // Return the list of users
    }
}
