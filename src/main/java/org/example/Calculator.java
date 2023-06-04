package org.example;

import java.util.Scanner;

public class Calculator {
    private int solution;
    private int x;
    private int y;
    private char operator;

    public Calculator() {
        solution = 0;
    }

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        solution = x / y;
        return solution;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation? ('+', '-', '*', '/')");
        char operator = scanner.nextLine().charAt(0);

        System.out.println("Insert 2 numbers:");
        System.out.println("Operand 1: ");
        int x = scanner.nextInt();
        System.out.println("Operand 2: ");
        int y = scanner.nextInt();

        int result = 0;
        switch (operator) {
            case '+':
                result = calculator.addition(x, y);
                break;
            case '-':
                result = calculator.subtraction(x, y);
                break;
            case '*':
                result = calculator.multiplication(x, y);
                break;
            case '/':
                result = calculator.division(x, y);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
