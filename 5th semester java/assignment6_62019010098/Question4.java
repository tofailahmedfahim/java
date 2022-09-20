package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Add");
        menu.add("Remove");
        menu.add("Display");
        menu.add("Exit");

        System.out.println("//display element");
        for (int index = 0; index < menu.size(); index++) {
            System.out.println(""+ menu.get(index));
        }
        System.out.print("\n");

        //declaring variables
        int menuID = 0;
        int changeIndex = 0;
        int delIndex = 0;
        String addTitle = "";
        String corrTitle = "";

        //Menu
        System.out.println("Enter 1 to add ");
        System.out.println("Enter 2 to remove ");
        System.out.println("Enter 3 to display");
        System.out.println("Enter 4 to quit");
        System.out.println("Enter a menu number (1-3 or 4 to Exit): ");
        menuID = input.nextInt();

        while (menuID != 0) {

            if (menuID >= 1 && menuID <= 3) {
                switch (menuID) {
                    case 1:
                        System.out.println("Enter the number to add: ");
                        addTitle = keyboard.nextLine();
                        menu.add(addTitle);

                        System.out.print("\n");
                        System.out.println("Your List ");
                        for (int index = 0; index < menu.size(); index++) {
                            System.out.println(" " + menu.get(index));
                        }
                        break;


                    case 2:
                        System.out.println("Enter number to remove: ");
                        delIndex = keyboard.nextInt();
                        menu.remove(delIndex);

                        System.out.println("Your List");
                        for (int index = 0; index < menu.size(); index++) {
                            System.out.println("  " + menu.get(index));
                        }
                        break;

                    case 3:
                        System.out.println("Your List");
                        for (int index = 0; index < menu.size(); index++)
                        {System.out.println(" " + menu.get(index));}
                        break;

                    case 4:
                        System.out.println("Goodbye!");
                        break;

                }
            }
            else if (menuID >=1 && menuID <= 3)
                System.out.println("You must enter a number 1-4:");
            System.out.println("Enter a menu number (1-3 or 4 to Exit): ");
            menuID = input.nextInt();
            input.nextLine();

        }
    }
}



