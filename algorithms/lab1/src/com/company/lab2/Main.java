package com.company.lab2;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {

    private static final double LOW_BORDER = 2.7;

    public static void main(String[] args) {
        System.out.println("Task 1: ");

        task1();

        System.out.println("Task 2: ");

        task2();

        System.out.println("Task 3: ");

        task3();

        System.out.println("Task 4: ");

        task4();
    }

    private static void task4() {
        int[] array = ArrayUtil.inputIntArray(5);

        int evenSum = Arrays.stream(array)
                .filter(elem -> elem % 2 == 0)
                .sum();

        int oddSum = Arrays.stream(array)
                .filter(elem -> elem % 2 == 1)
                .sum();

        System.out.printf("Even sum: %d\n", evenSum);
        System.out.printf("Odd sum: %d\n", oddSum);
    }

    private static void task3() {
        int[] array = {5, 112, 4, 3};
        int[] reversed = new int[array.length];

        int k = 0;
        for (int i = array.length; i > 0; i--) {
            reversed[k++] = array[i-1];
        }

        System.out.println(Arrays.toString(reversed));
    }

    private static void task2() {
        int[] array = ArrayUtil.inputIntArray(5);

        IntStream.of(array).max().ifPresent(max -> {
            System.out.printf("Max number of %s = %d\n", Arrays.toString(array), max);
        });
    }

    private static void task1() {
        double[] doubleArray = ArrayUtil.inputDoubleArray(10);

        double sum = DoubleStream.of(doubleArray)
                .filter(elem -> elem > LOW_BORDER)
                .sum();
        System.out.println(sum);
    }

}
