package com.serheev.calculator;

import java.util.Arrays;

public class CalcService {

    public static double calculate(double x, double y, char operator) throws IllegalArgumentException {
        CalcOperation op = Arrays
                .stream(CalcOperation.values())
                .filter(o -> o.getChar().equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown operator - " + operator));
        return op.calc(x, y);
    }

}
