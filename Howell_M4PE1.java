package howell_m4pe1;
/*
 * Rheanna Howell
 * M4PE1
 * 20210220
 * Design a program that asks the user to enter the total square feet 
 in a tract of land and calculate the number of acres in the tract.
 */
import java.util.Scanner;
public class Howell_M4PE1 
{
    public static void main(String[] args) 
    {
        //create object to get input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        //declare variables to hold tract size and acres
        double tractSize, acres;
        // declare constant for the acre in square feet
        final double ACRE = 43560;
        // Get the square feet in the tract
        System.out.print("Enter the tract size of the land in square feet: ");
        tractSize = keyboard.nextDouble();
        //System.out.println(tractSize);
        // Calculate the # of acres
        acres = tractSize / ACRE;
        // Display the number of acres
        System.out.println("The tract size is " + acres + " acres.");
        
    }    
}
