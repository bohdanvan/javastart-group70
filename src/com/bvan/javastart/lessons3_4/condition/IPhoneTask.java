package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        System.out.print("Are you happy? (yes/no) ");
        boolean happy = scanner.next().equals("yes");

        System.out.print("Does you girlfriend want? (yes/no) ");
        boolean girlfriendWants = scanner.next().equals("yes");

        long iPhonePrice = 999;

        // && - AND
        // || - OR
        // ! - NOT

        if ((happy || girlfriendWants) && money >= iPhonePrice) {
            System.out.println("Buy");
            money -= iPhonePrice;
        } else {
            System.out.println("Work hardly....");
        }

        System.out.println("Money left: " + money);
    }
}
