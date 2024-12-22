package com.example.calc_lab3;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.calculate(2.0, 3.0, "+"), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1.0, calculator.calculate(2.0, 3.0, "-"), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.calculate(2.0, 3.0, "*"), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.calculate(6.0, 3.0, "/"), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.calculate(6.0, 0.0, "/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        calculator.calculate(2.0, 3.0, "%");
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3.0, calculator.sqrt(9.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSquareRoot() {
        calculator.sqrt(-4.0);
    }

    @Test
    public void testChangeSign() {
        assertEquals(-5.0, calculator.changeSign(5.0), 0.001);
        assertEquals(5.0, calculator.changeSign(-5.0), 0.001);
    }
}
