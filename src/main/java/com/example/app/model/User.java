package com.example.app.model; // Update this line


public class User {
    private long id;           // Assuming id is of type long
    private final String username;   // Username
    private final String email;      // User email

    // Constructor
    public User(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
