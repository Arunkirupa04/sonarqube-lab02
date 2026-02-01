package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void testFindUserThrowsSQLException() {
        assertThrows(SQLException.class, () -> {
            userService.findUser("admin");
        });
    }

    @Test
    void testFindUserWithDifferentUsername() {
        assertThrows(SQLException.class, () -> {
            userService.findUser("user123");
        });
    }

    @Test
    void testDeleteUserThrowsSQLException() {
        assertThrows(SQLException.class, () -> {
            userService.deleteUser("admin");
        });
    }

    @Test
    void testDeleteUserWithDifferentUsername() {
        assertThrows(SQLException.class, () -> {
            userService.deleteUser("user123");
        });
    }

    @Test
    void testNotUsedMethod() {
        assertDoesNotThrow(() -> {
            userService.notUsed();
        });
    }

    @Test
    void testFindUserWithEmptyString() {
        assertThrows(SQLException.class, () -> {
            userService.findUser("");
        });
    }

    @Test
    void testDeleteUserWithEmptyString() {
        assertThrows(SQLException.class, () -> {
            userService.deleteUser("");
        });
    }
}
