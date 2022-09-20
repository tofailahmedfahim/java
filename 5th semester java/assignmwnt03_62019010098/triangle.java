package com.company;
import java.util.Scanner;

public class triangle {
    //intitializing slope value
    private static final double SLOPE = -0.5D;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking user input for co-ordinates
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        double y1 = calculateY1(x, y);

        //algorithm for checking if the point is in the triangle or not
        if ((x > 200.0D) || (x < 0.0D) || (y > 100.0D) || (y < 0.0D)) {
            System.out.println("The point is not in the triangle.");
        } else {

            if ((y1 <= 100.0D)) {
                System.out.println("The point is in the triangle");
            } else {
                System.out.println("The point is not in the triangle.");
            }
        }

    }

    private static double calculateY1(double x, double y) {
        double y1 = y + -x * SLOPE;
        return y1;
    }
}
