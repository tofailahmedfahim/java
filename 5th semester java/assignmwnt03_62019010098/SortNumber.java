package com.company;
import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //taking input for 3 integer
        System.out.print("Enter first integer");
        int num1 = s.nextInt();
        System.out.print("Enter second integer");
        int num2 = s.nextInt();
        System.out.print("Enter third integer");
        int num3 = s.nextInt();

        //sorting three integer
        if(num1 < num2){ if(num3 < num1) System.out.println("num2 > num1 > num3");}
        else{ if(num2 < num3) System.out.println("num3 > num2 > num1");
        else System.out.println("num1 > num2 > num3");}

    }
}
