import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    
	Scanner scan=new Scanner(System.in);
        Integer N=scan.nextInt();
        for(int i=1;i<=N;i++)
        {
            int k=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k+=N-j;
            }
            System.out.println();
        }
	}
}

OUTPUT:
5
  
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
