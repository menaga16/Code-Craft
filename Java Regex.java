import java.io.*;
import java.util.*;

class MyRegex {
    String pattern;

    MyRegex() 
    {
        String zeroTo255="(\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))";
        pattern=zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255;
    }
}

public class Solution {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        MyRegex myRegex=new MyRegex();

        while (scanner.hasNextLine()) 
        {
            String ipAddress=scanner.nextLine();
            boolean isValid=ipAddress.matches(myRegex.pattern);
            System.out.println(isValid);
        }
    }
}
