package com.company;
import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asking the user for month and year
        System.out.println("Enter a month:");
        int month = scanner.nextInt();
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        //using the class for cslculating days in a month
        DInMN period1 = new DInMN(month,year);

        //printing the result
        System.out.println(period1.getNumberOfDays()+"days");

    }


}
