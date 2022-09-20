package com.company;
import java.util.Scanner;

//multiplication table
public class NestedLoop {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        final int IMAX = 15;
        final int JMAX = 10;

        System.out.print("    |");
        for(int j = 1; j<=JMAX; j++)
        {
            System.out.print(" " + j + "     ");
            // This printed the top header
        }

        System.out.println();
        System.out.println("__________________________________________________________________________________________________________");


        for(int i = 1; i <= IMAX; i++)
        {
            if(i<=9)
                System.out.print(" " + i + "  |");
            else
                System.out.print(" " + i + " |");


            int j = 1;
            while (j <= i)
            {
                System.out.printf(" " + "%-6d", i * j);
                j += 1;
            }
            // move call to 'println()' here
            System.out.println();
        }


    }
    }
