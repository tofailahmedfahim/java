package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers,q to quit");
        while (scanner.hasNextInt() ) {
            int i = scanner.nextInt();
            numbers.add(i);
        }
        //sorting list to show only unique number
        List<Integer> UniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        //sorting the unique number in ascending order
        Collections.sort(UniqueNumbers);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + UniqueNumbers);


    }
}
