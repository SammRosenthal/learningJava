package com.samrosenthal;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }

    public static int sumDigits ( int number ) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }


        if ( sum != 0 ){
            return sum;
        } else {
            return -1;
        }

    }
}
