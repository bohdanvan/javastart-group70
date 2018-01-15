package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class AreasCalculator {

    public static void main(String[] args) {
        double[] w = {10, 4, 7, 1};
        double[] h = {20, 5, 2, 6};
        double[] res = rectangleAreas(w, h);

        System.out.println(Arrays.toString(res));
    }

    public static double[] rectangleAreas(
            double[] widths, double[] heights) {

        if (widths.length != heights.length) {
            throw new IllegalArgumentException("widths and heights have different size");
        }

        double[] areas = new double[widths.length];
        for (int i = 0; i < areas.length; i++) {
            areas[i] = Geometry.rectangleArea(widths[i], heights[i]);
        }
        return areas;
    }
}
