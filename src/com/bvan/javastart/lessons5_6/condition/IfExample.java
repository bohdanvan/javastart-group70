package com.bvan.javastart.lessons5_6.condition;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 10;

        if (x >= 20) {
            System.out.println("1"); // -
        } else {
            System.out.println("2"); // +
            if (x < 5) {
                System.out.println("4"); // -
            }
        }

        System.out.println("3"); // +
    }
}
