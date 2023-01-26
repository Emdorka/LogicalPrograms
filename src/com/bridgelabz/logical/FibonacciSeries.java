package com.bridgelabz.logical;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Fibonacci Series till 10th term");
        for (int i = 0; i < 10; i++) {
            System.out.println("" + firstNumber);
            int result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
    }
}
