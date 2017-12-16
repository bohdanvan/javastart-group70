package com.bvan.javastart.lessons3_4.types.double_type;

/**
 * @author bvanchuhov
 */
public class DoubleStrangeSum {

    public static void main(String[] args) {
        double d1 = 0.1 + 0.2;
        double d2 = 0.3 - 0.1;

        System.out.println(d1);
        System.out.println(d2);

        String s = String.format("%.3f", d2);
        System.out.println(s);
    }
}
