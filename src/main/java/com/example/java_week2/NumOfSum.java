package com.example.java_week2;

import java.util.Scanner;

public class NumOfSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or 0 to exit): ");
            int read = Integer.parseInt(reader.nextLine());

            if (read == 0) {
                break;
            }

            // Add the read number to the sum
            sum += read;

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
        reader.close();
    }
}
