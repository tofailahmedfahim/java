package com.company;

public class Question4 {
    public static void main(String args[]) {
    //this code wont work logical expression is too hard 
        int firstSequence = 0;
        int secondSequence = 1;
        int nextSequence;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (j % 2 == 0) {
                    nextSequence = secondSequence - firstSequence;
                    System.out.print(nextSequence);
                    firstSequence = secondSequence;
                    secondSequence = nextSequence;
                else {
                        nextSequence = secondSequence + firstSequence;
                        System.out.print(nextSequence);
                        firstSequence = secondSequence;
                        secondSequence = nextSequence;
                    }
                        System.out.println(nextSequence);
                        //thers bug in the code couldnt debug 

                }
            }
        }
    }
}

