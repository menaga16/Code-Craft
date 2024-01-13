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
public class Inverse_Right_angle {
    
public static void pattern(int n)
    {
        System.out.println("INVERSE RIGHT ANGEL TRIANGLE");
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a row value");
        Integer n=scan.nextInt();
        pattern(n);
        
    }
    
}
