/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandsOnTest_Howell;

/**
 *
 * @author Rheanna Howell
 */
public class TBA 
{
   //Variable declarations
    Declare Integer num1 = 1;
    Declare Integer num2 = 0;
    Declare Integer product;
    
    //Generate the multiplication table
    while num1 <= 12;
        while num2 <= 12;
            Set product = num1 * num2;
            Display num1, " * ", num2, " = ", product;
            Set num2 = num2 + 1;
        End While;
        Set num1 = num2 + 1;
        Set num2 = 0;
    End While;
}
