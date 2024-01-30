import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    
	Scanner scan=new Scanner(System.in);
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

OUTPUT:
5
    1
   21
  321
 4321
54321
