package com.company;
import java.util.Scanner;

public class GenarateTwoNumber {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        //genaraet two random numbers between 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        //asking user for addition of two genarated number
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        //checking and letting user know if the answer is true or false
        System.out.println( number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer ));

    }
}
