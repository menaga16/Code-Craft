import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        final Scanner in=new Scanner(System.in);
        final String s=in.next();
        final String t=in.next();
        int k=in.nextInt();
        final int sL=s.length();
        final int tL=t.length();
        
        int lastCommon=-1;
        while(lastCommon+1<sL&&lastCommon+1<tL&&s.charAt(lastCommon+1)==t.charAt(lastCommon+1)) 
        {
            lastCommon++;
        }
        
        if(lastCommon==-1) 
        { 
            if(k>=tL+sL) 
            {
                System.out.println("Yes");
            } 
                
            else 
            {
                System.out.println("No");
            }
        } 
        else 
        {
            int sDiff=sL-lastCommon-1;
            int tDiff=tL-lastCommon-1;
            if(k>=tL+sL) 
            {
                System.out.println("Yes");
            } 
            else if(k>=sDiff+tDiff&&(k-sDiff-tDiff)%2==0) 
            {
                System.out.println("Yes");
            } 
            else 
            {
                System.out.println("No");
            }
        }
    }
}
