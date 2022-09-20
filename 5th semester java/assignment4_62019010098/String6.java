package com.company;

public class String6 {
    public static void main(String args[]) {

        //6 string
                String str1 = "welcome";
                String str2 = "to";
                String str3 = "java";
                String str4 = "";
                String str5 = "STRING";
                String str6 = "java is fun";


       int value1 = str1.length();
        System.out.println(value1);//print the length of string1 name

       int value2 = str2.length();
        System.out.println(value2);//print the length of string2 name

        //if the string is empty the method return true otherwise false
        System.out.println(str3.isEmpty());
        System.out.println(str4.isEmpty());


        //Convert characters from uppercase to lowercase using String five
        String lstr = str5.toLowerCase();
        System.out.println(lstr);

        String replaceString=str6.replace('a','i');//replaces all occurrences of 'a' to 'i'
        System.out.println(replaceString);


    }
}
