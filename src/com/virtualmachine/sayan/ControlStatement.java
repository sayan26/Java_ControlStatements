package com.virtualmachine.sayan;

public class ControlStatement {

        public static void main(String[] args){
            boolean gameOver = true;
            int score = 10000;
            int levelCompleted = 8;
            int bonus = 200;

            if(score > 5000 && score <8000){
                System.out.println("Your score is greater than 5000 but less than 8000");
            }
            else if(score >= 8000 && score < 10000){
                System.out.println("Your score is or greater than 8000 but less than 2000");
            }
            else{
                System.out.println("You have won the game. Congratulations. Level Attained:\t" +levelCompleted);
            }

            if(gameOver){
                int finalScore = score +(levelCompleted * bonus);
                System.out.println("Final Score:\t" +finalScore);
            }
        }
}

