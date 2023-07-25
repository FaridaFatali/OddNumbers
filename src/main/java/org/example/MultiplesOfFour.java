package org.example;

import java.util.Scanner;

// Calculate the sum of the numbers entered by the user which are multiples of four, until he enters a negative number

public class MultiplesOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number % 4 == 0) {
                sum += number;
            }
        } while (number > 0);
        System.out.println("Sum of numbers that are multiples of four: " + sum);
    }
}
