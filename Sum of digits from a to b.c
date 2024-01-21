#include <stdio.h>

int main() 
{

    int a,b,sum=0;
    scanf("%d %d",&a,&b);
    int sum1;
    for(int i=a;i<=b;i++)
    {
        sum1=i;
        while(sum1>0) {
            sum=sum+sum1%10;
            sum1/=10;
        }
    }
    printf("%d",sum);
}
/*
11 12
5

...Program finished with exit code 0
Press ENTER to exit console.
*/

