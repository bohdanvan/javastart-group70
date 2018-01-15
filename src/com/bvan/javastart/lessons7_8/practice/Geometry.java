package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Geometry {

    public static void main(String[] args) {
        System.out.println(rectangleArea(10, 20)); // 200
        System.out.println(rectangleArea(30, 20)); // 600

        System.out.println(circleArea(10)); // 314
        System.out.println(circleArea(20));
    }

    public static double rectangleArea(
            double width, double height) {

        if (width <= 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height must be > 0");
        }

        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be > 0");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
