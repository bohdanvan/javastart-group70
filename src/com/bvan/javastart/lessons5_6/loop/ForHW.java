package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class ForHW {

    public static void main(String[] args) {
        // 10..30
        for (int n = 10; n <= 30; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 20..-40
        for (int n = 20; n >= -40; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
