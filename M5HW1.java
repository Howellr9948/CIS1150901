/*
 * Exercise 4 on page 190 in the Programming Exercise
 */
package m5hw1;

import java.util.Scanner;

/**
 * Rheanna Howell
 * M5HW1
 * 20210321
 * Create an if-else program that ask the user for numeric form month, day, and
 * two digit year and determine whether the month times the day equals the year.
 */
import math;
        
public class M5HW1 
{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        //asks user for numeric form of month, day, and two-digit year
        //create variables
        double month, day, year;
    
        //create input for variables
        //Display input
        System.out.print("Please enter numeric month: ");
        month = keyboard.nextDouble();
    
        System.out.print("Please enter number day: ");
        day = keyboard.nextDouble();
    
        System.out.print("Please enter numeric two-digit year: ");
        year = keyboard.nextDouble();
    
        //program should then determine whether the month times the day equals the
        //the year. If so, displau a message saying the date is magic. Otherwise,
        //display a message the date is not magic.
        //Create if-then for variables
        if (month*day == year)//equal too
        {
            System.out.println("The date is magic.");
        }
        else
        {
            System.out.println("The date is not magic.");
        }
    }
    
}
