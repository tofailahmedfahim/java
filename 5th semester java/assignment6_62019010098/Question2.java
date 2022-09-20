package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Question2 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        // Swap elements using the swap method(false swap)
        System.out.println("Before swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        // Swap elements using the swapFirstTwoInArray method
        System.out.println("Before swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }
    // Swap two variables(false swap)
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    // Swap the first two elements in the array
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}


