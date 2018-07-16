import java.util.Scanner;


public class MowingApp {

/* Bob has a lawn service business. Bob estimates that he can mow 40 sq yard of lawn in 2 minutes.
    Write a program that allow Bob to enter the length and width of a lawn. The program should then compute
    the square yardage and the time it will take to mow it. Display the length, width, square yardage,
    and the amount of time to mow it.*/

    public static void main (String[]args) {

        //Unneeded variables, use method approach
        //double length;
        //double width;
        //double squareYardage;
        //double mowingTime;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of a lawn: ");
        double userLength = sc.nextDouble();

        System.out.print("Enter the width of a lawn: ");
        double userWidth = sc.nextDouble();

        double squareYardage = calculateArea(userLength, userWidth);
        double mowingTime = calculateTime(squareYardage);

        System.out.println("The time it takes to mow a " + squareYardage +
                " sq yard is: " + mowingTime + " minutes.");
    }

    //Method to calculateArea

    public static double calculateArea(double length, double width) {
        double squareYardage = length * width;
        return squareYardage;
    }

    //Method to calculateTime

    public static double calculateTime(double squareYardage) {
        double mowingTime = (squareYardage/40)*2;
        return mowingTime;
    }

}