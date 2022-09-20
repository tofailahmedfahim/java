package com.company;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an ASCII code
        // (an integer between 0 and 127)
        System.out.print("Enter an ASCII code: ");
        int i = input.nextInt();

        // Display ASCII code as character
        System.out.printf("The charecter for the ASCII code %d is ",i);
        System.out.println((char)i);
    }
}
