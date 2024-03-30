public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n*2;j++)
            {
                if(j>n-i && j<(n+i))
                {
                        System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
           
        System.out.println();
        }
    }
}


output:
    *
   ***
  *****
 *******
*********
