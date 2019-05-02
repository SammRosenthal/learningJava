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

            if (validNumber) {
                int currentNumber = scanner.nextInt();
                sum += currentNumber;
                numbersEntered++;
            } else {
                System.out.println("That is an invalid number.");
            }

            scanner.nextLine();
        }

        System.out.println("The sum of your numbers is " + sum + ".");
        scanner.close();

    }
}
