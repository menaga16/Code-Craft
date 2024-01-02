#include <stdio.h>

int gcd(int a, int b) 
{
    if(b==0) 
    {
        return a;
    }
    return gcd(b,a % b);
}

int lcm(int a,int b) 
{
    return(a*b)/gcd(a,b);
}

int smallest_number_divisible_by_range(int n) 
{
    int result=1;
    for(int i=1;i<=n;i++) 
    {
        result=lcm(result,i);
    }
    return result;
}

int main()
{
    int t;
    scanf("%d",&t);
    for(int a0=0;a0<t;a0++)
    {
        int n;
        scanf("%d",&n);
        printf("%d\n",smallest_number_divisible_by_range(n));
    }
    return 0;
}


/*

Input (stdin)
2
3
10
Your Output (stdout)
6
2520
Expected Output
6
2520

*/

