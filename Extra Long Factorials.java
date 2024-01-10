import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution 
{

    public static void main(String[] args) 
    {
       
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        BigInteger x=BigInteger.valueOf(n);
        n=n-1;
        while(n>0)
        {
            x=x.multiply(BigInteger.valueOf(n));
            n=n-1;
        }
        
        System.out.println(x.toString());
       
    }
}
