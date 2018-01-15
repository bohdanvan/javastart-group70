package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Reference {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2); // false
        System.out.println(s2.equals(s2)); // true
    }
}
