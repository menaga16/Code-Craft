class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) 
    {
        List<String>result=new ArrayList<>();
        int i=0;

        while(i<words.length) 
        {
            int linestart=i;
            int linelength=words[i].length();

            while(i+1<words.length&&linelength+words[i+1].length()+1<=maxWidth) 
            {
                i++;
                linelength+=words[i].length()+1;
            }

            StringBuilder line=new StringBuilder(words[linestart]);
            int numwords=i-linestart;

            if(numwords==0||i==words.length-1) 
            {
                for(int j=linestart+1;j<=i;j++) 
                {
                    line.append(' ').append(words[j]);
                }
                while(line.length()<maxWidth) 
                {
                    line.append(' ');
                }
            } 
            else 
            {
                int totalspaces=maxWidth-linelength+numwords;
                int spacesbetweenwords=totalspaces/numwords;
                int extraspaces=totalspaces%numwords;

                for(int j=linestart+1;j<=i;j++) 
                {
                    int spaces=spacesbetweenwords+(j-linestart<=extraspaces?1:0);
                    for(int k=0;k<spaces;k++) 
                    {
                        line.append(' ');
                    }
                    line.append(words[j]);
                }
            }
            result.add(line.toString());
            i++;
        }

        return result;
    }
}

OUTPUT:

Input
words =
["This", "is", "an", "example", "of", "text", "justification."]
maxWidth =
16
Output
["This    is    an","example  of text","justification.  "]
