package com.bridgelabz.logical;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;
        int i = 1;
        while (i <= num / 2) {
            if (num % i == 0) {
                sum = sum + i;
            }
                i++;
            }
            if (sum == num) {
                System.out.println( num + " is a perfect number");
            } else
                System.out.println( num + " is not a perfect number");
        }
    }

            
