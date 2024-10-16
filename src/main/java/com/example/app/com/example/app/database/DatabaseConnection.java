package com.example.app.database; // Update this line


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://glazed-crow-2584.j77.aws-ap-south-1.cockroachlabs.cloud:26257/dummydb?sslmode=verify-full";
    private static final String USER = "anuzz"; // Replace with your CockroachDB username
    private static final String PASSWORD = "qWWsuwh5UwASfjXL6UdnIg"; // Replace with your CockroachDB password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver"); // Load PostgreSQL JDBC driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handle the exception
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
