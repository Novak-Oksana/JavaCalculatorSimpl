package com.work;

/**
 * Created by Ksu on 10.09.2017.
 */
public class Calculator {

    public int funct_calc(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                return a / b;
            case '*':
                return a * b;
        }
        throw new IllegalArgumentException("Illegal operator");
    }
}
