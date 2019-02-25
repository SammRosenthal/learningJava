package com.samrosenthal;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000) {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//          doesnt work
//        int savedFinalScore = finalScore;
    }
}
