package com.company;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int data;
        int sum = 0;
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sequence of integer");
        // Keep reading data until the sum is greater than 100
        do {
            // Read the next data
            data = input.nextInt();
            sum += data;
        } while (sum<100);

        System.out.println("Done");



        }
}
