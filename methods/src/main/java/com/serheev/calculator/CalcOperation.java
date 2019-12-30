package com.serheev.calculator;

public enum CalcOperation implements CalcInterface {
    ADD('+', (a, b) -> a + b),
    MUL('*', (a, b) -> a * b),
    DIV('/', (a, b) -> a / b),
    SUB('-', (a, b) -> a - b),
    POW('^', (a, b) -> Math.pow(a, b)),
    SQR('r', (a, b) -> Math.pow(a, 1.0 / b)),
    SQRLOG('l', (a, b) -> Math.exp(Math.log(a) / b));

    private final char operator;
    private final CalcInterface operation;

    CalcOperation(char operator, CalcInterface operation) {
        this.operator = operator;
        this.operation = operation;
    }

    public Character getChar() {
        return operator;
    }

    @Override
    public double calc(double x, double y) {
        return operation.calc(x, y);
    }
}
