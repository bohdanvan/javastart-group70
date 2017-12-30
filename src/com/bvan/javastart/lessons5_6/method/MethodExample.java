package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    // Client
    public static void main(String[] args) {
        int x = Min.min(10, 20); // вызов метода
        int y = Min.min(50, 40);
        System.out.println(x + y); // 50
    }
}
