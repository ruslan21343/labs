package com.company.lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int multiplication = a * b;
        int number = Math.floorDiv(multiplication, c);

        for (int i = 0; i < 10; i++) {
            number++;
        }

        if (number > 100) {
            System.out.println("Such a nice number");
        } else {
            System.out.println("Also nice number ;)");
        }

    }

}
