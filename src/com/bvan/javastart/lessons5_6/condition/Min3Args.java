package com.bvan.javastart.lessons5_6.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Min3Args {

    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scan.nextInt();

        System.out.print("Enter b: ");
        int b = scan.nextInt();

        System.out.print("Enter c: ");
        int c = scan.nextInt();

        // BL
        // int min = (condition) ? res-true : res-false;
        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

        // Output
        System.out.println("min = " + min);
    }
}
