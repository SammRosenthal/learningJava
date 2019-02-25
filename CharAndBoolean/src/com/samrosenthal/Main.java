package com.samrosenthal;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println(myChar);

        boolean myBoolean = true;

        // challenge
        char registeredSymbol = '\u00AE';
        System.out.println(registeredSymbol);

    }
}
