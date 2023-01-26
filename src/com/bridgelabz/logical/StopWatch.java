package com.bridgelabz.logical;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any key to start");
        char startKey = scanner.next().charAt(0);
        long start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println("Enter any key to stop");
        char stopKey = scanner.next().charAt(0);
        long stop = System.currentTimeMillis();
        System.out.println(stop);
        double elapsedTime = (stop - start) / 1000;
        System.out.println("Elapsed time is " + elapsedTime + " seconds");
    }
}
