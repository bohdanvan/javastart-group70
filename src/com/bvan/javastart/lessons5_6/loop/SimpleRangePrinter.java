package com.bvan.javastart.lessons5_6.loop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class SimpleRangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt(); // 10
        int to = scanner.nextInt(); // 40

        // from..to
        for (int n = from; n <= to; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
