/*
 * Rheanna
 * M5HW2
 * 20210323
 * Time calculator: Design a program that asks the user to enter a number of
 * seconds.
 */
package m5hw2;

import java.util.Scanner;

public class M5HW2 
{
    
    public static void main(String[] args) 
    {
        //Declare variables
        Scanner scan = new Scanner(System.in);
        final int MIN = 60, HRS = 3600, DYS = 84600;
        int input, days, seconds, minutes, hours, rDays, rHours;
        
        //input
        System.out.println("Enter amount of seconds: ");
        input = scan.nextInt();
        
        //make calculations
        days = input/DYS;
        rDays = input%DYS;
        hours = rDays/HRS;
        rHours = rDays%HRS;
        minutes = rHours/MIN;
        seconds = rHours%MIN;
        
        //create if-selse statement for calculations
        if (input >= DYS) 
        {
            System.out.println(input + " seconds equals to " + days + " days " +
                    hours + " hours " + minutes + " minutes " + seconds + 
                    " seconds");
        }

        else if (input >= HRS && input < DYS) 
        {
            System.out.println(input + " seconds equals to " + hours + 
                    " hours " + minutes + " minutes " + seconds + " seconds");
        }

        else if (input >= MIN && input < HRS) 
        {
            System.out.println(input + " seconds equals to " + minutes + 
                    " minutes " + seconds + " seconds");
        }

        else if (input < MIN) 
        {
            System.out.println(input + " seconds equals to seconds");
        }
    }
    
}
