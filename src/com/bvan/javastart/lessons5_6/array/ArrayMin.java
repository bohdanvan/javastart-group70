package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class ArrayMin {

    public static void main(String[] args) {
        int[] array = {15, 30, 10, 20};

        int min = array[0];
        for (int elem : array) {
            if (min > elem) {
                min = elem;
            }
        }

        System.out.println("min = " + min);
    }
}
