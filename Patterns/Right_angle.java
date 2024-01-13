/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.Scanner;
import static patterns.Patterns.pattern;

/**
 *
 * @author menaga
 */
public class Right_angle{

public static void pattern(int n)
    {
        System.out.println("RIGHT ANGLE TRIANGLE");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }        
    }
            
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a row value:");
        Integer n=scan.nextInt();
        pattern(n);
    }
}

    
