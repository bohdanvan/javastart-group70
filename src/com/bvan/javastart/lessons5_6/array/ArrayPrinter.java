package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {10, 60, 30, 20};

        // iter
        for (int elem : array) {
            System.out.println(elem);
        }
    }
}
