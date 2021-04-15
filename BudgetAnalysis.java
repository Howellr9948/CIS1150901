/*
 * Rheanna Howell
 * M6A1
 * 20210413
 * 
 */
package m6a1;

import java.util.Scanner;

public class BudgetAnalysis 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
     {
      //Creating an instance of Scanner class
      Scanner keyboard=new Scanner(System.in);
      int total_amount=0;
      int budject_amunt=0;
      int price=0;
      boolean repeat=true;
      String userChoice="y";
      System.out.println("Enter budget of the month.");
      /*Entering the budger amount */
      budject_amunt=Integer.parseInt(keyboard.nextLine());
      /*repeating until repeat is true*/
      while(repeat)
      {
          //prompting for the price
          System.out.println("Enter price.");
          price=Integer.parseInt(keyboard.nextLine());
          //add price to the total amount
          total_amount+=price;
         
          //asking the user to enter y for yes and n for no
          System.out.println("Do you want to add another expense?");
          userChoice=keyboard.nextLine();
          /*Setting repeat to false if the user input is n or N*/
          if(userChoice.equals("n")|| userChoice.equals("N"))
              repeat=false;
      }
      //printing the total amount
      System.out.println("Total amount is "+total_amount);
     
      if(total_amount<budject_amunt)
          System.out.println("Expenses are under the budget");
      else if(total_amount>budject_amunt)
          System.out.println("Expenses are above the budget");
      else
          System.out.println("Expenses are equal to budget");
  }
}
