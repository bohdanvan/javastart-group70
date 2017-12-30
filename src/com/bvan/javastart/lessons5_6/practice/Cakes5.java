package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter people: ");
        int people = scanner.nextInt();

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();

        for (int person = 1; person <= people; person++) {
            System.out.println("I'm " + person + " person. " +
                    "I have " + cakes + " cakes.");

            for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
                System.out.println("I'm " + person + " person. " +
                        "I have eaten " + cakeIndex + " cake.");
            }
            System.out.println();
        }
    }
}
