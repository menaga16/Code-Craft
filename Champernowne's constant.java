import java.util.Scanner;

public class ChampernownesConstant 
{
    static long[] digit=new long[20];
    static long[] sum=new long[20];

    static long find(long num) 
    {
        int d=1;
        while(sum[d]<num)d++;

        num-=sum[d-1];

        long number=(long) Math.pow(10,d-1);
        long counter=(num-1)/d;
        long extract=num%d;
        if(extract==0)extract=d;
        number+=counter;

        while(d!=extract) 
        {
            number/=10;
            d--;
        }

        return number%10;
    }

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        long temp=9,ans;
        sum[1]=9;
        for(int i=2;i<18;i++) 
        {
            temp*=10;
            sum[i]=sum[i-1]+i*temp;
        }

        int t=scanner.nextInt();
        while(t-->0) 
        {
            ans=1;
            for(int i=0;i<7;i++) 
            {
                temp=scanner.nextLong();
                ans*=find(temp);
            }
            System.out.println(ans);
        }
    }
}
