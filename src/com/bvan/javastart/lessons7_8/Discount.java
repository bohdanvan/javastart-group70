package com.bvan.javastart.lessons7_8;

/**
 * @author bvanchuhov
 */
public class Discount {

    public static void main(String[] args) {
        System.out.println(processDiscount(2000, "notebook"));
        System.out.println(processDiscount(1500, 20));
        System.out.println(processDiscount(3000, 0, 1000));
    }

    public static double processDiscount(
            double price, String productName) {

        return processDiscount(price, getDiscount(productName));
    }

    public static double getDiscount(String productType) {
        if (productType.equals("notebook")) {
            return 10;
        }
        if (productType.equals("smartphone")) {
            return 20;
        }
        return 0;
    }

    public static double processDiscount(
            double price, double discount, double limit) {

        if (price <= 0) {
            throw new IllegalArgumentException("price must be > 0");
        }
        if (discount < 0) {
            throw new IllegalArgumentException("discount must be >= 0");
        }
        if (limit < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }

        if (price >= limit) {
            return price * (1 - discount / 100);
        }
        return price;
    }

    // Overloading

    public static double processDiscount(
            double price, double discount) {
        return processDiscount(price, discount, 1000);
    }
}
