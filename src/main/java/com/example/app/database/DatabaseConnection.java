package com.example.app.database; // Correct package declaration

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://glazed-crow-2584.j77.aws-ap-south-1.cockroachlabs.cloud:26257/dummydb?sslmode=verify-full";
    private static final String USER = "anuzz"; // CockroachDB username
    private static final String PASSWORD = "qWWsuwh5UwASfjXL6UdnIg"; // CockroachDB password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver"); // Load PostgreSQL JDBC driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Print stack trace if driver not found
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
