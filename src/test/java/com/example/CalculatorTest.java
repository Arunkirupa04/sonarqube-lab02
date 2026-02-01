package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddOperation() {
        assertEquals(15, calculator.calculate(10, 5, "add"));
    }

    @Test
    void testAddAgainOperation() {
        assertEquals(15, calculator.calculate(10, 5, "add-again"));
    }

    @Test
    void testSubtractOperation() {
        assertEquals(5, calculator.calculate(10, 5, "sub"));
    }

    @Test
    void testSubtractAgainOperation() {
        assertEquals(5, calculator.calculate(10, 5, "sub-again"));
    }

    @Test
    void testMultiplyOperation() {
        assertEquals(50, calculator.calculate(10, 5, "mul"));
    }

    @Test
    void testDivideOperation() {
        assertEquals(2, calculator.calculate(10, 5, "div"));
    }

    @Test
    void testDivideByZero() {
        assertEquals(0, calculator.calculate(10, 0, "div"));
    }

    @Test
    void testModuloOperation() {
        assertEquals(0, calculator.calculate(10, 5, "mod"));
    }

    @Test
    void testPowerOperation() {
        assertEquals(1024, calculator.calculate(2, 10, "pow"));
    }

    @Test
    void testInvalidOperation() {
        assertEquals(0, calculator.calculate(10, 5, "invalid"));
    }

    @Test
    void testAddNumbers() {
        assertEquals(15, calculator.addNumbers(10, 5));
    }

    @Test
    void testSumValues() {
        assertEquals(15, calculator.sumValues(10, 5));
    }

    @Test
    void testAddAgain() {
        assertEquals(15, calculator.addAgain(10, 5));
    }
}
