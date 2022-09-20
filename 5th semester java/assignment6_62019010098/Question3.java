package com.company;

public class Question3 {
        public static void main(String[] args) {
            int rows, column, sumRow, sumColumn;

            //Initialize matrix a
            int a[][] = {
                    {1, 2, 3,4},
                    { 5, 6,7,8},

            };

            //Calculates number of rows and columns present in given matrix
            rows = a.length;
            column = a[0].length;

            //Calculates sum of each row of given matrix
            for(int i = 0; i < rows; i++){
                sumRow = 0;
                for(int j = 0; j < column; j++){
                    sumRow = sumRow + a[i][j];
                }
                System.out.println("Sum of " + (i+1) +" row: " + sumRow);
            }

            //Calculates sum of each column of given matrix
            for(int i = 0; i < column; i++){
                sumColumn = 0;
                for(int j = 0; j < rows; j++){
                    sumColumn = sumColumn + a[j][i];
                }
                System.out.println("Sum of " + (i+1) +" column: " + sumColumn);
            }
        }
    }