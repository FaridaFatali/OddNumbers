package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=qV0mW3sUlpU&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=17
 * @author Farida Fatali
 */

// Calculate the sum of only the odd numbers entered by the user until he enters a negative number

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

/*  Version 1:
        while (true){
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number < 0){
                break;
            }
            if (number % 2 != 0){
                sum += number;
            }
        } System.out.println("Sum of the odd numbers: " + sum);
*/

// Version 2:
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number % 2 == 1) {
                sum += number;
            }
        } while (number > 0);
        System.out.println("Sum of the odd numbers: " + sum);
    }
}