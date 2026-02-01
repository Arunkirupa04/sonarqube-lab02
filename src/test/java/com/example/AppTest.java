package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testMainMethodRuns() {
        // Test that main method executes without throwing an exception
        assertDoesNotThrow(() -> {
            App.main(new String[]{});
        });
    }
}
