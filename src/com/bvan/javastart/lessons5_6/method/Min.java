package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class Min {

    public static int min(int a, int b) { // описание метода
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
