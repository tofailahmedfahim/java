package com.company;
import java.util.Scanner;

public class VoulumeOfCylinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //prompt user for input radiius and length
        System.out.print("Enter the radius:");
        double r = s.nextDouble();
        System.out.print("Enter the length:");
        double l = s.nextDouble();

        //compute the volume of cylinder
        double pi = 3.14159;
        double area = r * r * pi;
        double volume = area * l;
        System.out.println("volume of Cylinder is: " +volume);
    }
}
