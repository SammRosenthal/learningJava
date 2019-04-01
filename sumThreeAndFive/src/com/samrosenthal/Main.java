package com.samrosenthal;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int numbersFound = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                numbersFound++;
                System.out.println(i + " is divisible by 3 and 5");
            }

            if (numbersFound == 5){
                break;
            }
        }

        System.out.println("The sum of the numbers found is " + sum);

    }

}
