package com.bvan.javastart.lessons5_6.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Min {

    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scan.nextInt();

        System.out.print("Enter b: ");
        int b = scan.nextInt();

        // BL
//        int min;
//        if (a < b) {
//            min = a;
//        } else {
//            min = b;
//        }

        int min = (a < b) ? a : b;

        // Output
        System.out.println("min = " + min);
    }
}
