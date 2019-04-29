package com.samrosenthal;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2016";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number= " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String doubleAsString = "2016.12";
        System.out.println("doubleAsString = " + doubleAsString);

        double intDouble = Double.parseDouble(doubleAsString);
        System.out.println("doubleAsDouble =" + intDouble);
    }
}
