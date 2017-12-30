package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[5];

        array[1] = 100;

        int length = array.length;
        System.out.println("length = " + length);

        System.out.println(Arrays.toString(array));
        System.out.println(array[3]);
    }
}
