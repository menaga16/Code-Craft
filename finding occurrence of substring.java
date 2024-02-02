class Solution 
{
    public int strStr(String haystack, String needle)
     {
        int i;
        int n=haystack.length();
        int m=needle.length();
       
        for( i=0;i<=n-m;i++)
        {
            if ((haystack.substring(i,i+m)).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}

output:

haystack =
"leetcode"
needle =
"leeto"
  
Output
-1
Expected
-1
