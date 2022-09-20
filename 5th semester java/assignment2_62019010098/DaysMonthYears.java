package com.company;
import java.util.Scanner;

public class DaysMonthYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //talking a int number as input from user
        System.out.print("Please Enter The Number(NUM) :");
        int ndays = input.nextInt();

        //calculating days month and year
        int y = ndays / 365;
        ndays = ndays-(365*y);
        int m = ndays/30;
        int d = ndays-(m*30);
        System.out.println(+d+ "Days" +m+ "months" +y+ "Years");

    }
}

