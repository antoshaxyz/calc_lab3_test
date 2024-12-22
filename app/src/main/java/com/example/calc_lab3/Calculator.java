package com.example.calc_lab3;

public class Calculator {

    public double calculate(double firstValue, double secondValue, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                if (secondValue != 0) result = firstValue / secondValue;
                else throw new ArithmeticException("Cannot divide by zero");
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
        return result;
    }

    public double sqrt(double value) {
        if (value < 0) throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        return Math.sqrt(value);
    }

    public double changeSign(double value) {
        return value * -1;
    }
}
