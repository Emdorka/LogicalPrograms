package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        int number = scanner.nextInt();
        int sum = 2;
        int value = 0;
        while (sum < number) {
            if (number % sum == 0) {
                value++;
                break;
                   }
                    sum++;
                 }
                if ( value == 0){
                System.out.println(number + " is a prime number");
                 } else
                     System.out.println(number +" is not a prime number");
    }
}

