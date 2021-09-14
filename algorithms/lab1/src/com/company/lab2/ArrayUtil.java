package com.company.lab2;

import java.util.Scanner;

public class ArrayUtil {

    private static final Scanner scanner = new Scanner(System.in);


    public static double[] inputDoubleArray(int countOfNumber){
        double[] result = new double[countOfNumber];

        for (int i = 0; i < countOfNumber; i++) {
            System.out.printf("Number %d: ", i);
            result[i] = scanner.nextDouble();
        }

        return result;
    }

    public static int[] inputIntArray(int countOfNumber){
        int[] result = new int[countOfNumber];

        for (int i = 0; i < countOfNumber; i++) {
            System.out.printf("Number %d: ", i);
            result[i] = scanner.nextInt();
        }

        return result;
    }

}
