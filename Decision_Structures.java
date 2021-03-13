package m5cw1_howell;

/**
 * Rheanna Howell
 * M5CW1 (Howell)
 * 20210313
 * This program will demo decision structures
 */
import java.util.Scanner;

public class Decision_Structures 
{
    
    
    public static void main(String[] args)
    {
        //call both programs
        //determinLoanStatus():
        compareNames();
        
    }
    
    public static void determinLoanStatus()
    {
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Declare variables
        double salary, yearsOnJob;
        
        //Get the annual salary.
        System.out.print("Enter your annual salary: ");
        salary = keyboard.nextDouble();
        
        //Get the number of years on the current job.
        System.out.print("Enter the number of years on your " + 
                "current job: ");
        yearsOnJob = keyboard.nextDouble();
        
        //Determine whether the user qualifies.
        if (salary >= 30000)
        {
            if (yearsOnJob >= 2)
            {
                System.out.println("You qualify for the loan.");
            }
            else
            {
                System.out.println("Your must have been on your current");
                System.out.println("job for at least two years to qualify.");
            }
        }
        else
        {
                System.out.println("You must earn at least $30,000");
                System.out.println("per year to qualify.");
        }
    }
    public static void compareNames()
    {
        //Creat a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Declare variables to hold two names
        String name1;
        String name2;
        
        //Prompt the user for two names
        System.out.print("Enter a name (Last name first): ");
        name1 = keyboard.nextLine();
        System.out.print("Enter another name (Last name first): ");
        name2 = keyboard.nextLine();
        
        //Display the names in alphabetical order.
        System.out.println("Here are the names, listed alphabetically: ");
        if (name1.compareTo(name2) < 0)
        {
            System.out.println(name1);
            System.out.println(name2);
        }
        else
        {
            System.out.println(name2);
            System.out.println(name1);
        }
    }
}
