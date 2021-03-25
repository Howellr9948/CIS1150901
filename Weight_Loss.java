/*
 *
 */
package handsontest_howell;

public class Weight_Loss 
{
    //Variables for the user's weight
    Declare Real weight;
            
    //Constant for the monthly weight loss
        Constant Real MONTHLY_WEIGHT_LOSS = 4;
                    
    //Get the user's starting weight
        Display "Enter your starting weight.";
        Input weight;
                            
    //Display weight at the end of month 1
        Set weight = weight-MONTHLY_WEIGHT_LOSS;
        Display "Your weight at the end of month 1 is ", weight;
    
    //Display weight at the end of month 2
        Set weight = weight-MONTHLY_WEIGHT_LOSS;
        Display "Your weight at the end of mont 2 is ", weight;
    
    //display weight at the end of month 3
        Set weight = weight-MONTHLY_WEIGHT_LOSS;
        Display "Your weight at the end of month 3 is ", weight;
    
    //display weight at the end of month 4
        Set weight = weight-MONTHLY_WEIGHT_LOSS;
        Display "Your weight at the end of month 4 is", weight;
    
    //display weight at the end of month 5
        Set weight = weight-MONTHLY_WEIGHT_LOSS;
        Display "Your weight at the end of month 5 is ", weight;
    
    //display weight at the end of month 6
        Set weight = weight-MONTHLY_WEIGHT_LOSS;
        Display "Your weight at the end of month 6 is", weight;
}
