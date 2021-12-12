package com.virtualmachine.sayan;

public class MethodChallenge {

    public static void main(String[] args){

        displayPlayerPosition("Sayan", 2);
        int finalScore = calculateScore3(1500);
        System.out.println(finalScore);
    }

    public static void displayPlayerPosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " +playerPosition+ " on the score table.");
    }

    public static int calculateScore3(int score) {
        if(score>=1000){
            return 1;
        }
        else if(score >=500 && score < 1000){
            return 2;
        }
        else if(score >=100 && score < 500){
            return 3;
        }
        else {
            return 4;
        }
    }
}
