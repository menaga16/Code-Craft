import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    
	Scanner scan=new Scanner(System.in);
        System.out.println("enter a value: ");
        Integer N=scan.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int j=N-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
	}
}
