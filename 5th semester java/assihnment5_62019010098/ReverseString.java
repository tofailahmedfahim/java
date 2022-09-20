package com.company;
import java.lang.*;

public class ReverseString {
        public static void main(String[] args)
        {
            String str = "Welcome";

            // conversion from String object to StringBuffer
            StringBuffer sbr = new StringBuffer(str);
            // To reverse the string
            sbr.reverse();
            System.out.println(sbr);
        }
    }
