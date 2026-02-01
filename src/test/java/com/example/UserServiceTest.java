package com.example;

import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserService userService;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void testFindUserThrowsSQLException() {
        // Test that findUser throws SQLException (due to invalid DB credentials)
        assertThrows(SQLException.class, () -> {
            userService.findUser("admin");
        });
    }

    @Test
    void testDeleteUserThrowsSQLException() {
        // Test that deleteUser throws SQLException (due to invalid DB credentials)
        assertThrows(SQLException.class, () -> {
            userService.deleteUser("admin");
        });
    }

    @Test
    void testNotUsedMethod() {
        // Test that notUsed method executes without throwing an exception
        assertDoesNotThrow(() -> {
            userService.notUsed();
        });
    }
}
