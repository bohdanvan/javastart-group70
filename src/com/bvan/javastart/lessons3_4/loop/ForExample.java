package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // 20...30
        for (int n = 20; n <= 30; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 50...40
        for (int n = 50; n >= 40; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 50, 60, 70, ... 100
        for (int n = 50; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
