package main.java.com.example;

import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testFindUserThrowsSQLException() {
        // Test that findUser throws SQLException (due to invalid DB credentials)
        assertThrows(SQLException.class, () -> {
            userService.findUser("admin");
        });
    }

    @Test
    public void testDeleteUserThrowsSQLException() {
        // Test that deleteUser throws SQLException (due to invalid DB credentials)
        assertThrows(SQLException.class, () -> {
            userService.deleteUser("admin");
        });
    }

    @Test
    public void testNotUsedMethod() {
        // Test that notUsed method executes without throwing an exception
        assertDoesNotThrow(() -> {
            userService.notUsed();
        });
    }
}
