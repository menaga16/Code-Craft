class Solution {
    public boolean isPalindrome(String s) 
    {
        String str=s.replaceAll("[^a-zA-Z0-9]", "").replaceAll("[,:]","");
        String reverse= "";
    
    int strLength=str.length();

    for(int i=(strLength-1);i>=0;--i) 
    {
      reverse=reverse+str.charAt(i);
    }

    if(str.toLowerCase().equals(reverse.toLowerCase())) 
    {
      return true;
    }
    else 
    {
      return false;
    }
   
  }
}
