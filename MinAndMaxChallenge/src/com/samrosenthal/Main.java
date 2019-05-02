package com.samrosenthal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int min = 0;
	    int max = 0;

	    while (true) {
            System.out.println("Enter number: ");
            boolean validInt = scanner.hasNextInt();

                if (validInt) {
                    int currentInt = scanner.nextInt();

                    if (currentInt > max) {
                        max = currentInt;
                    }

                    if (currentInt < min || min == 0) {
                        min = currentInt;
                    }
                } else {
                    System.out.println("The max number you have entered is: " + max + " and the lowest number you have entered is " + min + ".");
                    break;
                }


        }
    }
}
