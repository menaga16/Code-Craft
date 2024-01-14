/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class Left_angle {
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a value: ");
        Integer N=scan.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<N;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            
          
        
    }
    
}
