package com.bridgelabz.logical;

import java.util.Scanner;

public class LargestAmongThree implements Interface {
    public void maxNumber(int num1, int num2, int num3) {
        if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1 + " is the largest");
        } else if (num2 >= num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + " is the largest");
        }
    }

    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        number1 = scanner.nextInt();
        System.out.println(" Enter the second number");
        number2 = scanner.nextInt();
        System.out.println(" Enter the third number");
        number3 = scanner.nextInt();
        LargestAmongThree largest = new LargestAmongThree();
        largest.maxNumber(number1, number2, number3);
    }
}





