package com.example.java_week2;

import java.util.Scanner;

public class Until {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
