package com.bridgelabz.logical;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the amount");
        int amount = scanner.nextInt();
        int note;
        if (amount >= 1000) {
            amount = getTheAmount( 1000, amount);
        }
        if (amount >= 500) {
            amount = getTheAmount( 500, amount);
        }
        if (amount >= 100) {
            amount = getTheAmount(  100, amount);
        }
        if (amount >= 50) {
            amount = getTheAmount(50, amount);
        }
        if (amount >= 10) {
            amount = getTheAmount( 10, amount);
        }
        if (amount >= 5) {
            amount = getTheAmount(5, amount);
        }
        if (amount >= 2) {
            amount = getTheAmount(2, amount);
        }
        if (amount >= 1) {
            amount = getTheAmount(1, amount);
        }
    }
     public static int getTheAmount( int note, int amount){
         int remaining = amount / note;
            System.out.println("Amount of note " + note + " is Rs " + remaining);
         amount = amount % note;
         return amount;
        }
    }



