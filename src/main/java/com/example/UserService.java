package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {

    // Get credentials from environment variables
    private String getPassword() {
        String pwd = System.getenv("DB_PASSWORD");
        return pwd != null ? pwd : System.getProperty("db.password", "");
    }

    private String getUsername() {
        String user = System.getenv("DB_USER");
        return user != null ? user : System.getProperty("db.user", "root");
    }

    private String getDbUrl() {
        String url = System.getenv("DB_URL");
        return url != null ? url : System.getProperty("db.url", "jdbc:mysql://localhost/db");
    }

    // VULNERABILITY: SQL Injection
    public void findUser(String username) throws SQLException {
        try (Connection conn = DriverManager.getConnection(getDbUrl(), getUsername(), getPassword());
             Statement st = conn.createStatement()) {
            String query = "SELECT * FROM users WHERE name = '" + username + "'";
            st.executeQuery(query);
        }
    }

    // SMELL: Unused method
    public void notUsed() {
        System.out.println("I am never called");
    }

    // EVEN WORSE: another SQL injection
    public void deleteUser(String username) throws SQLException {
        try (Connection conn = DriverManager.getConnection(getDbUrl(), getUsername(), getPassword());
             Statement st = conn.createStatement()) {
            String query = "DELETE FROM users WHERE name = '" + username + "'";
            st.execute(query);
        }
    }
}
