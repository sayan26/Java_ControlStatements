package com.virtualmachine.sayan;

public class Methods {

    public static void main(String[] args){
        //calculateScore(true,10000,8,200);
        int highScore = calculateScore2(true,8000,5,100);
        System.out.println(highScore);
    }

    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

        if(gameOver){
            int finalScore = score +(levelCompleted * bonus);
            System.out.println("Final Score:\t" +finalScore);
        }
    }

    public static int calculateScore2(boolean gameOver,int score,int levelCompleted,int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            //finalScore+=2000;
            return finalScore;
        }
        return -1;
    }
}
