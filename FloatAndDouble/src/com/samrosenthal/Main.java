package com.samrosenthal;

public class Main {

    public static void main(String[] args) {

	    // width of integer = 32 (4 bytes)
        int myIntValue = 5 / 2;

        // width of a float = 32 (4 bytes)
	    float myFloatValue = 5f / 2f;

	    // width of a double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println(("myFloatValue = " + myFloatValue));
        System.out.println("myDoubleValue = " + myDoubleValue);

        // challenge
        double pounds = 200d;
        double kilo = (pounds * 0.45359237d);

        System.out.println(pounds + " pounds = " + kilo + " kilograms");

    }
}
