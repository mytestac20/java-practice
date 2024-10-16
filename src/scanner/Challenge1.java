package scanner;

import java.util.Scanner;

/**
 * Created by
 * /
 * Write a java program using the following requirement.
 * 1.Create a Java class with name 'Challenge1'
 * 2.Create a main method.
 * 3.Declare the Two String type variables with names 'name' and 'message' and assign value is
 *   'name'= 'Your name(Jay)' and 'message'= 'Good Morning'
 * 4.Print the following message using above variables, println statements and Concatenation.
 */
public class Challenge1 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String name = "Manmeet";
        String message = "Good Morning";
        System.out.println("Hi " + name);
        System.out.println(message);
        scanner.close();
    }

    public static void printMessage(String name, String message){


    }
}
