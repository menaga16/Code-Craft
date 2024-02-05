class Solution {
    public String reverseWords(String s) 
    {
        String[] reverse=s.split("\\s+");
        int len=reverse.length;
        StringBuilder rarr=new StringBuilder();
        for( int i=len-1;i>=0;i--)
        {
            rarr.append(reverse[i]).append(" ");
        
        }

        return rarr.toString().trim();
      
    }
}

output:

Input
s =
"the sky is blue"
Output
"blue is sky the"
