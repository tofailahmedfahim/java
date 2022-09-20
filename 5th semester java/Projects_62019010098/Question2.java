package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Question2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //creating a arraylist of 7
        int n = 7;
        ArrayList<String> days = new ArrayList<String>(n);
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        //asking user for current date and days into future
        System.out.println("Enter current days (0 as Sunday 6 as Saturday) (0-6): ");
        int a = input.nextInt();
        System.out.println("Enter Days into future :");
        int b = input.nextInt();

        //(Current date) + (Days into the future) = (Future date)
        int c = a+b;
        //if the future date is greater than 6 the programme will count from 0
        if (c>6){
          c = c%7;
        }

        //printing the future date
        String futureDay = days.get(c);
        System.out.println("Future date is:  "+futureDay);

}
}