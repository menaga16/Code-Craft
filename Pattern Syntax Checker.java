import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        scanner.nextLine(); 
        for (int i=0;i<testCases;i++) 
        {
            String pattern=scanner.nextLine();
            try 
            {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } 
            catch (PatternSyntaxException e) 
            {
                System.out.println("Invalid");
            }
        }
    }
}
