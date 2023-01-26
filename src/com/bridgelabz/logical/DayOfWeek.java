package com.bridgelabz.logical;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month");
        int m = scanner.nextInt();
        System.out.println("Enter the day");
        int d = scanner.nextInt();
        System.out.println("Enter the year");
        int y = scanner.nextInt();
        int yn = y - (14 - m) / 12;
        int x = yn + yn / 4 - yn / 100 + yn / 400;
        int mn = m + 12 * ((14 - m) / 12) - 2;
        int dn = (d + x + (31 * mn) / 12) % 7;
        switch (dn) {
            case 0:
                System.out.println(" Sunday ");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
                System.out.println(" The Day of the year is " + dn);
    }
}