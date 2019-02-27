package com.samrosenthal;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//      boolean gameOver = true;
//      int score = 5000;
//      int levelCompleted = 5;
//      int bonus = 100;

//
//        int highScore = calculateScore(true, 5000, 8, 100);
//        System.out.println("Your final score was " + highScore);
//        calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score was " + highScore);


//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//          doesnt work
//        int savedFinalScore = finalScore;


        displayHighScorePosition("Sam Rosenthal", 10);
        System.out.println(calculateHighScorePosition(700));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
