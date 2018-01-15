package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class AreasSumCalculator {

    public static void main(String[] args) {
        double[] radiuses = {10, 20};
        double res = circleAreasSum(radiuses);
        System.out.println(res);
    }

    public static double circleAreasSum(double[] radiuses) {
        double sum = 0.0;
        for (double radius: radiuses) {
            sum += Geometry.circleArea(radius);
        }
        return sum;
    }
}
