package com.company;

public class Question5 {
    public static void main(String[] args) {

        int [][] matrix = {
                {1, 34},
                {2, 44},
                {3, 23},
                {4, 76},
                {5, 65},
                {6, 98},
                {7, 123},
                {8, 102},
                {9, 87},
                {10, 43},
                {11, 34},
                {12, 12}
        };
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();

        }
    }
}
