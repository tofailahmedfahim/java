package com.company;

public class MinMaxAbs {
    public static void main(String[] args) {
        int i1 = 27;
        int i2 = -45;
        double d1 = 84.6;
        double d2 = 0.45;

        //find the min and max value from i1 and i2
        System.out.println("Minimum out of '" + i1 + "' and '" + i2 + "' = " + Math.min(i1, i2));
        System.out.println("Maximum out of '" + i1 + "' and '" + i2 + "' = " + Math.max(i1, i2));

        //abs value of i1 and i2
        System.out.println("Absolute value of i1: " + Math.abs(i1));
        System.out.println("Absolute value of i2: " + Math.abs(i2));

        //round the double number
        System.out.println("Round off for d1: " + Math.round(d1));
        System.out.println("Round off for d2: " + Math.round(d2));


    }
}
