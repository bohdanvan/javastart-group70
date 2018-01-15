package com.bvan.javastart.lessons7_8.values_storing;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * @author bvanchuhov
 */
public class LocalDateExample {

    public static void main(String[] args) {
        // Java 8 (2013)

        LocalDate ld1 = LocalDate.now();
        System.out.println("ld1 = " + ld1);

        LocalDate ld2 = LocalDate.of(2000, 5, 15);
        System.out.println("ld2 = " + ld2);

        LocalDate ld3 = ld2.plusYears(3);
        System.out.println("ld3 = " + ld3);

        LocalDate elvisBirthDate = LocalDate.of(1935, 1, 8);
        DayOfWeek dayOfWeek = elvisBirthDate.getDayOfWeek();

        String s = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk"));
        System.out.println(s);
    }
}
