#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define MAX_LIMIT 1000001

void sieveOfEratosthenes(bool*prime) 
{
    prime[0]=prime[1]=false;
    for(int i=2;i*i<MAX_LIMIT;i++) 
    {
        if(prime[i]) 
        {
            for(int j=i*i;j<MAX_LIMIT;j+=i) 
            {
                prime[j]=false;
            }
        }
    }
}

long long int primeSum[MAX_LIMIT];

void calculatePrimeSum() 
{
    bool prime[MAX_LIMIT];
    for(int i=0;i<MAX_LIMIT;i++) 
    {
        prime[i]=true;
        primeSum[i]=0;
    }

    sieveOfEratosthenes(prime);

    for(int i=2;i<MAX_LIMIT;i++) 
    {
        if (prime[i]) 
        {
            primeSum[i]=primeSum[i-1]+i;
            
        } 
        else 
        {
            primeSum[i]=primeSum[i-1];
        }
    }
}

int main() {
    int t;
    scanf("%d", &t);
    
    calculatePrimeSum();

    for (int a0 = 0; a0 < t; a0++) {
        int n;
        scanf("%d", &n);
        printf("%lld\n", primeSum[n]);
    }
    return 0;
}
