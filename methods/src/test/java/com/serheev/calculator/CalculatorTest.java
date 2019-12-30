package com.serheev.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void shouldPerformAdditionCorrectly() {
        double actual = CalcService.calculate(3, 2, '+');
        double expected = 5.0;
        double delta = .0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldPerformSubtractionCorrectly() {
        double actual = CalcService.calculate(3, 2, '-');
        double expected = 1.0;
        double delta = .0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldPerformMultiplicationCorrectly() {
        double actual = CalcService.calculate(3, 2, '*');
        double expected = 6.0;
        double delta = .0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldPerformDivisionCorrectly() {
        double actual = CalcService.calculate(3, 2, '/');
        double expected = 1.5;
        double delta = .0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldPerformPowerCorrectly() {
        double actual = CalcService.calculate(3, 3, '^');
        double expected = 27.0;
        double delta = .0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldTakeSquareRootCorrectly() {
        double actual = CalcService.calculate(9, 2, 'r');
        double expected = 3.0;
        double delta = .0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldTakeSquareRootLogCorrectly() {
        double actual = CalcService.calculate(9, 2, 'l');
        double expected = 3.0;
        double delta = .001;
        assertEquals(expected, actual, delta);
    }
}