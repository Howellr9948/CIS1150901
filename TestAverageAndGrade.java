/*
 * Rheanna Howell
 * M7A1
 * 20210428
 * The program should display a letter grade for each score and the average for
 * test score.
 */
package m7a1_howell;

import java.util.Scanner;

public class TestAverageAndGrade 
{
 public static void main(String[] args)
 {
    Scanner keyboard=new Scanner(System.in);
    int testScoreA;
    int testScoreB;
    int testScoreC;
    int testScoreD;
    int testScoreF;
    System.out.print("Enter your first test score: ");
    testScoreA = keyboard.nextInt();
    System.out.print("Enter your second test score: ");
    testScoreB = keyboard.nextInt();
    System.out.print("Enter your third test score: ");
    testScoreC = keyboard.nextInt();
    System.out.print("Enter yout fourth test score: ");
    testScoreD = keyboard.nextInt();
    System.out.print("Enter your fifth test score: ");
    testScoreF = keyboard.nextInt();
    keyboard.nextLine();
    double average = calcAverage(testScoreA, testScoreB, testScoreC, 
            testScoreD, testScoreF);
    System.out.println("The average is: " + average);
    determineGrade(average);
 }
    public static double calcAverage(int testScoreA, int testScoreB, int
    testScoreC, int testScoreD, int testScoreF)
 {
    double average = (testScoreA + testScoreB + testScoreC + testScoreD +
    testScoreF) / 5;
    return average;
 }
    public static double determineGrade(double average)
    {
        if (average>90)
        {
            System.out.println("You got an A");
        }
        else if (average>=80)
        {
            System.out.println("You got a B");
        }
        else if (average>=70)
        {
            System.out.println("You got a C");
        }
        else if (average>=60)
        {
            System.out.println("You got a D");
        }
        else if (average<60)
        {
            System.out.println("You got an F");
        }
                return 0;
    }
}