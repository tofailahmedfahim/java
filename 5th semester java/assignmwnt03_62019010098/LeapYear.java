
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //prompts the user to enter a year as an int value
        System.out.print("Enter a Year:");
        int year = s.nextInt();

        //checking if the year is leap year
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.format("\n %d is a Leap Year. \n", year);
        } else {
            System.out.format("\n %d is NOT a Leap Year. \n", year);
        }
    }
}
