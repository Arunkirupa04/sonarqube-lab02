package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddOperation() {
        assertEquals(15, calculator.calculate(10, 5, "add"));
    }

    @Test
    public void testAddAgainOperation() {
        assertEquals(15, calculator.calculate(10, 5, "add-again"));
    }

    @Test
    public void testSubtractOperation() {
        assertEquals(5, calculator.calculate(10, 5, "sub"));
    }

    @Test
    public void testSubtractAgainOperation() {
        assertEquals(5, calculator.calculate(10, 5, "sub-again"));
    }

    @Test
    public void testMultiplyOperation() {
        assertEquals(50, calculator.calculate(10, 5, "mul"));
    }

    @Test
    public void testDivideOperation() {
        assertEquals(2, calculator.calculate(10, 5, "div"));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0, calculator.calculate(10, 0, "div"));
    }

    @Test
    public void testModuloOperation() {
        assertEquals(0, calculator.calculate(10, 5, "mod"));
    }

    @Test
    public void testPowerOperation() {
        assertEquals(1024, calculator.calculate(2, 10, "pow"));
    }

    @Test
    public void testInvalidOperation() {
        assertEquals(0, calculator.calculate(10, 5, "invalid"));
    }

    @Test
    public void testAddNumbers() {
        assertEquals(15, calculator.addNumbers(10, 5));
    }

    @Test
    public void testSumValues() {
        assertEquals(15, calculator.sumValues(10, 5));
    }

    @Test
    public void testAddAgain() {
        assertEquals(15, calculator.addAgain(10, 5));
    }
}
