package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        double celsius = -10.0; // Input: any valid Celsius temperature

        double fahrenheit = 1.8 * celsius + 32; // Your formula

        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
    }

}
