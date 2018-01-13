package com.bvan.javastart.lessons7_8;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class Prices {

    public static void main(String[] args) {
        double[] prices = {1000, 2000, 1700};
        System.out.println(prices.length);
        System.out.println(Arrays.toString(prices));

        // for-each
        double total = total(prices);
        System.out.println("total = " + total);

    }

    public static double total(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public static double oldTotal(double[] prices) {
        double total = 0.0;
        for (int i = 0; i < prices.length; i++) {
            double price = prices[i];
            total += price;
        }
        return total;
    }
}
