package com.samrosenthal;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMin = -2_147_483_648;
	    int myMax = 2_147_483_647;
	    int myTotal = (myMin / 2);
        System.out.println("myTotal = " + myTotal);


	    // byte has a width of 8
	    byte myByteValue = -128;
	    byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

	    // short has a width of 16
	    short myShortValue = -32768;
	    short myNewShortValue = (short) (myShortValue / 2);
        System.out.println("myNewShortValue = " + myNewShortValue);

	    // long has a width of 64
	    long myLongValue = -9_223_372_036_854_775_807L;

	    // challenge
		byte myByte = 5;
		short myShort = 10;
		int myInt = 20;
		long myLong = (50000L + 10L * (myByte + myShort + myInt)));
		System.out.println("Challenge answer = " + myLong);
    }
}
