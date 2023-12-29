#include <stdio.h>

void rotateLayer(int rows,int cols,int matrix[300][300],int r,int layer) 
{
    int rotation=r%(2*(rows+cols-4*(layer-1))-4);

    while (rotation--) 
	{
        int temp=matrix[layer-1][layer-1];

        for(int i=layer-1;i<cols-layer;i++)
        {
		    matrix[layer-1][i]=matrix[layer-1][i+1];
		}

        for (int i=layer-1;i<rows-layer;i++)
        {
            matrix[i][cols-layer]=matrix[i+1][cols-layer];
        }
        for (int i=cols-layer;i>layer-1;i--)
        {
            matrix[rows-layer][i]=matrix[rows-layer][i-1];
        }

        for (int i=rows-layer;i>layer;i--)
        {
        	matrix[i][layer-1]=matrix[i-1][layer-1];
        }
        matrix[layer][layer-1]=temp;
    }
}

void matrixRotation(int m,int n,int matrix[300][300],int r) 
{
    int layers=(m<n?m:n)/2;

    for (int layer=1;layer<=layers;layer++)
    {
        rotateLayer(m,n,matrix,r,layer);
    }
}

int main() {
    int m,n,r;
    scanf("%d %d %d",&m,&n,&r);

    int matrix[300][300];

    for (int i=0;i<m;i++)
    {
    	for (int j=0;j<n;j++)
    	{
            scanf("%d",&matrix[i][j]);
        }
    }

    matrixRotation(m,n,matrix,r);
    for (int i=0;i<m;i++) 
	{
        for (int j=0;j<n;j++)
        {
            printf("%d ",matrix[i][j]);
        }
        printf("\n");
    }

    return 0;
}



/*

output:

Success

Input (stdin)
4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Expected Output
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15

*/
