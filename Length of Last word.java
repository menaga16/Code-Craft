class Solution {
    public int lengthOfLastWord(String s) 
    {
        String[] str=s.split("\\s+");
        int slen=str.length;
        for(int i=0;i<slen;i++)
        {
            if(i==slen-1)
            {
                String a=str[i];
                int len=a.length();
                System.out.println(len);
                return len;
            }
        }
        return 0;
    }
}

output:

Input: s = "Hello World"
Output: 5
