package com.bridgelabz.logical;

public class ReverseANumber {
    public static void main(String[] args) {
        int number = 32;
        int reverse = 0;
        while (number > 0) {
            int result = number % 10;
            reverse = (reverse * 10) + result;
            number = number / 10;
        }
            System.out.println(reverse);
        }
    }
