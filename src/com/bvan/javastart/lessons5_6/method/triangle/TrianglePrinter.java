package com.bvan.javastart.lessons5_6.method.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        printTriangle(3);
        printTriangle(5);
        printTriangle(7);

//        printTriangle(-1); // IllegalArgumentException
    }

    public static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("size is negative: " + size);
        }
        for (int count = 1; count <= size; count++) {
            printLine(count);
        }
    }

    public static void printLine(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("count is negative: " + count);
        }
        for (int n = 1; n <= count; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
