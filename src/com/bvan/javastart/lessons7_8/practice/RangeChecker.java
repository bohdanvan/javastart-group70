package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class RangeChecker {

    public static boolean isAllInRange(
            double[] shapes, double minShape, double maxShape) {

        // iter
        for (double shape : shapes) {
            if (shape < minShape || shape > maxShape) {
                return false;
            }
        }
        return true;
    }

}
