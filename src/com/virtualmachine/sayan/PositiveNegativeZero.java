package com.virtualmachine.sayan;

public class PositiveNegativeZero {

    public static void main(String[] args){

        checkNumber(5);
    }

    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("Positive");
        }
        else if(number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
