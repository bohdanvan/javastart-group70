package com.bvan.javastart.lessons7_8.values_storing;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        s2 += ", world";

        System.out.println("s1 = " + s1); // Hello
        System.out.println("s2 = " + s2); // Hello, world
    }
}
