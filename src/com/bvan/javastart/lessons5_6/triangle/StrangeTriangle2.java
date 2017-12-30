package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class StrangeTriangle2 {

    public static void main(String[] args) {
        int size = 10;

        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
