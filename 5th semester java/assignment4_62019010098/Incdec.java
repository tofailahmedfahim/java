package com.company;

public class Incdec {
    public static void main(String[] args) {
        int i = 6;

        System.out.format(" Value of i : %d \n", i++); // Using increment Operator
        System.out.format(" Value of i : %d \n", i); //Incremented value

        int j = 7;
        System.out.format(" Value of j : %d \n", j--); // Using Decrement
        System.out.format(" Value of j : %d \n", j); //Decrement value


        String s = "Life";
        String[] stringarray = s.split("|");    //we can use dot, whitespace, any character


        //iterate over string array
        for (int n = 0; n < stringarray.length; n++) {
            //prints the tokens
            System.out.println(stringarray[n]);

        }
    }
}