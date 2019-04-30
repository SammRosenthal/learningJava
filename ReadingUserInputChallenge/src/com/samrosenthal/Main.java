package com.samrosenthal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersEntered = 1;
        int sum = 0;

        while (numbersEntered < 11) {
            System.out.println("Enter number #" + numbersEntered + ":");
            boolean validNumber = scanner.hasNextInt();
            int currentNumber = scanner.nextInt();

            if (validNumber) {
                sum += currentNumber;

            } else {
                System.out.println();
            }

            numbersEntered++;
        }

        System.out.println("The sum of your numbers is " + sum + ".");
        scanner.close();

    }
}
