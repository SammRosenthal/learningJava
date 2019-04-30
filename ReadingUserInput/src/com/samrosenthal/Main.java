package com.samrosenthal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        int age = 2019 - yearOfBirth;

        // this is to skip the enter key and not set name to enter;
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }
}
