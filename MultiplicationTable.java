/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m6a2_howell;

public class MultiplicationTable 
{
    for(int x=1; x<=12;x++)
    {
	for(int y=1;y<=12;y++)
	{
            int product=x*y; 
            System.out.println(x+" * "+y+" = "+product);
	}
    }
}
