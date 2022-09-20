package com.company;


public class Question_6 {
    public static void main(String[] args) {

        int a = 785446;
        int b = 679343;
        double c = 1.1505;
        double d = 3.7034;
        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        String s = "welcome";
        String t = "java";
        System.out.println("For the first method: " + sumDigits(a));
        System.out.println("For the second method:" + sumabc(a, b, c));
        System.out.println("For the third method:");
        System.out.println("Sum of integer is:" + sumint(a, b));
        System.out.println("Difference of double value is :" + diffdouble(c, d));
        System.out.println("For the fourth method:" + sumall(a, b, castAscii, c, d));
        System.out.println("For the fifth method:");
        System.out.println("Sum is :" + sumall(a, b, c, d));
        System.out.println("Char is " + ch);
        System.out.println("The string is: "+s+t);


    }

    public static int sumDigits(int n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }

    public static double sumabc(int a, int b, double c) {
        double sum;
        sum = a + b + c;
        return sum;
    }

    public static int sumint(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    public static double diffdouble(double a, double b) {
        double diff;
        diff = a - b;
        return diff;
    }

    //in this sumall method methodoverloading been used
    public static double sumall(double a, double b, double c, double d) {
        double sum;
        sum = a + b + c + d;
        return sum;
    }

    public static double sumall(double a, double b, double c, double d, double e) {
        double sum;
        sum = a + b + c + d + e;
        return sum;
    }
}
