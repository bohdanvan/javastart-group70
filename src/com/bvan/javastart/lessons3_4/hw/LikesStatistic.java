package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class LikesStatistic {

    public static void main(String[] args) {
        long likesCount = 3;
        int registrationYear = 2016;

        int currentYear = java.time.Year.now().getValue();
        double likesPerYear =
                (double)likesCount/(currentYear-registrationYear+1);
        System.out.println(likesPerYear + " likes / year");
    }
}
