package com.samrosenthal;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored" + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0){
            return -1;
        }


        double answer = (feet * 2.54) + ((inches / 12) * 2.54);

        System.out.println(answer);
        return answer;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ( inches < 0){
            return -1;
        }

        double feetCalc = (inches / 12);

        return calcFeetAndInchesToCentimeters(feetCalc, 0);

    }

}
