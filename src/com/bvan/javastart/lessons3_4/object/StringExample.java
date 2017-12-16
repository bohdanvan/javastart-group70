package com.bvan.javastart.lessons3_4.object;

import java.lang.*;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Prog Kiev";

        int length = s.length();
        System.out.println(length);

        char c = s.charAt(1);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);

        boolean startsWithProg = s.startsWith("Prog");
        System.out.println("startsWithProg = " + startsWithProg);

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
