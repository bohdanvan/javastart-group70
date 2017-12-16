package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1...7): ");
        int day = scanner.nextInt();

        boolean isWorkingDay = day <= 5;
        if (isWorkingDay) {
            System.out.println("Work");
        }
        System.out.println("Java Courses");
    }
}
