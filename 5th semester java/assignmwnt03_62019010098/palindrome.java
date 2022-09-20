package com.company;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        //checking and printing the number is palindeome or not
        int originalNumber = number;
        int reminder = 0;
        int reversedNumber = 0;
        while (number != 0) {

            reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number = number / 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println("The number " + originalNumber + " is a palindrome");
        } else {
            System.out.println("The number " + originalNumber + " is not a palindrome");
        }
    }
}
