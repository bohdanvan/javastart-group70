package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class YearsArray {

    public static void main(String[] args) {
        int[] years = new int[19];

        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + i;
        }

        System.out.println(Arrays.toString(years));
    }
}
