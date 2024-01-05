import java.io.*;
import java.util.*;

public class Solution 
{
    
    public static boolean [] isPrime=new boolean[10000010];
    public static Map<String,List<Integer>>matches=new HashMap();
    
    public static int siblings=7;
    public static int replace=3;
    public static int maxDigits=7;
    public static int smallestPrime=99999999;
    
    public static void generateSieve(int n) 
    {
        
        for(int i=0;i<n+1;i++) 
        {
            isPrime[i]=true;
        }
        
        for(int i=2;i<n+1;i++) 
        {
            if(isPrime[i]) 
            {
                for(int j=i+i;j<n+1;j+=i) 
                {
                    isPrime[j]=false;
                }
            }
        }
    }
   
    public static void match(int number,char [] regex,int digit, int howOften, int startPos) 
    { 
        char asciiDigit=(char)(digit+'0');
        
        for(int i=startPos;i<maxDigits;i++) 
        {
            if(regex[i]!=asciiDigit)
            {
                continue;
            }
            if(i==0&&asciiDigit=='0')
            {
                continue;
            }
            regex[i]='.';
            
            if(howOften==1) 
            {
                List<Integer>addTo=matches.get(String.valueOf(regex));
                if(addTo==null) 
                {
                    addTo=new ArrayList();
                }
                addTo.add(number);
                matches.put(String.valueOf(regex), addTo);
                if(addTo.size()>=siblings&&addTo.get(0)<smallestPrime)
                {
                    smallestPrime = addTo.get(0);
                }
            } 
            else 
            {
                match(number,regex,digit,howOften-1,i+1);
            }
            
            regex[i]=(char)(digit+'0');
        }
    }

    public static void main(String[] args) 
    {        
        Scanner scan=new Scanner(System.in);
        maxDigits=scan.nextInt();
        replace=scan.nextInt();
        siblings=scan.nextInt();
        
        int minNumber=1;
        for(int i=1;i<maxDigits;i++) 
        {
            minNumber*=10;
        }
        int maxNumber=minNumber*10-1;
        generateSieve(10000000);
        
        for(int i=minNumber;i<=maxNumber;i++) 
        {            
            if(isPrime[i]) 
            {            
                String strNum=String.valueOf(i);
                for(int digit=0;digit<=9;digit++)
                {
                    match(i,strNum.toCharArray(),digit,replace,0);
                }
                
                if(maxDigits==7) 
                {
                    if(replace==1&&i>2000000)
                    {
                        break;
                    }
                    if(replace==2&&i>3000000)
                    {
                        break;
                    }
                }
            }   
        }
        
        String minimum="";
        for(Map.Entry<String,List<Integer>>m:matches.entrySet())
        {
            if(m.getValue().size()<siblings)
            {
                continue;
            }
            if(m.getValue().get(0)!=smallestPrime)
            { 
                continue;
            }
            
            String s="";
            for(int i=0;i<siblings;i++)
            {
                s+=String.valueOf(m.getValue().get(i)+" ");
            }
            
            if(minimum.compareTo(s)>0||minimum.isEmpty())
            {
                minimum=s;
            }
        }
        System.out.println(minimum);
    }
}
