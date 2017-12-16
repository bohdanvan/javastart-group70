package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class Overflow {

    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println(b);
    }
}
