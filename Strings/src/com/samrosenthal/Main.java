package com.samrosenthal;

public class Main {

    public static void main(String[] args) {

	    String myString = "This is a string";
        myString = myString + ", and this is more.";

        System.out.println(myString);


        String numberString = "250.55";
        numberString = numberString + "44.95";

        System.out.println(numberString);


        String lastString = "10";
        int myInt = 50;
        lastString = myInt + lastString;

        System.out.println(lastString);
    }
}
