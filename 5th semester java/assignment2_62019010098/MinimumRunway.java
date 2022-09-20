package com.company;

import java.util.Scanner;

public class MinimumRunway {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            //taking input from usr for speed and accelaration
        System.out.print("Enter speed and acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();

        //calculating minimum runway length
        double length = (speed * speed) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f\n", length);
    }
}
