/*
 * Rheanna Howell
 * CIS - 115 - 0901
 * Final Exam
 * DUE: May 5 - 10
 */
package howellfinalexam;

import java.util.Scanner;

public class HowellFinalExam 
{
    
static Scanner sc = new Scanner(System.in); //scanner class to take input

public static void main(String[] args) 
{
 /*calling functions as per instructions*/
 displayInfo();
       double payRate = getRate(); //This function is returning value
       double hours = getHours(); //This function is returning value
       double grossPay = calculateGrossPay(payRate,hours); 
       displayRHGrossPay(payRate,hours,grossPay);
}

/*Displaying user info*/
public static void displayInfo()
{
    
 System.out.println("My name is Rheanna.");
 System.out.println("Date: 05-05-2021");
 System.out.println("This Program calculates the gross pay for an individual.");
 
}
/*Fetching rate using scanner class. It returns double type data*/
   public static double  getRate()
   {
       
    double rate;
    System.out.println("Please enter your pay rate: ");
    rate = sc.nextDouble();
    return rate; //This line returns data to main program
    
   }
/*Fetching hours using scanner class. It returns double type data*/
   public static double getHours()
   {
       
    double hours;
    System.out.println("Please enter your hours: ");
    hours = sc.nextDouble();
    return hours;
    
   }
/*calculating gross pay using formula given. It returns double type data*/
   public static double calculateGrossPay(double payRate, double hours) 
   {
       
    double grossPay;
    grossPay = payRate * hours;
    return grossPay;
    
   }
   /*Displaying result*/
   public static void displayRHGrossPay(double payRate, double hours,
           double grossPay) 
   {
       
    System.out.println("The pay rate is $" + payRate);
    System.out.println("The hours worked are " + hours);
    System.out.println("The gross pay is $" + grossPay);
    
   }
   
}