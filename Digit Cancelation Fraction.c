#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int fractions[100][2]; 
    int count=0; 
    for(int i=10;i<100;i++) 
    {
        for(int j=10;j<100;j++) 
        {
            if(i<j) 
            {
                if((i%10==j/10)&&(j%10!=0)&&((float)(i/10)/(float)(j%10)==(float)i/(float)j)) 
                {
                    fractions[count][0]=i;
                    fractions[count][1]=j;
                    count++;
                } 
                else if((i/10==j%10)&&(j%10!=0)&&((float)(i%10)/(float)(j/10)==(float)i/(float)j)) 
                {
                    fractions[count][0]=i;
                    fractions[count][1]=j;
                    count++;
                }
            }
        }
    }

    int numerator_sum=0,denominator_sum=0;
    for(int i=0;i<count;i++) 
    {
        numerator_sum+=fractions[i][0];
        denominator_sum+=fractions[i][1];
    }

    printf("%d %d\n",numerator_sum,denominator_sum);

    return 0;
}
