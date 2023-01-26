package com.bridgelabz.logical;

import java.util.Scanner;

public class monthlyPayment {
    public static double monthlyPayment(double P, double R, double Y) {
        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = (P * r) / (1 - Math.pow((1 + r), (-n)));
        return payment;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for Principal amount ");
        int P = scanner.nextInt();
        System.out.println("Enter the interest amount");
        int R = scanner.nextInt();
        System.out.println("Enter the year to pay off principal loan");
        int Y = scanner.nextInt();
        System.out.println(" Monthly Payment is " + monthlyPayment(P, R, Y));

    }
}
