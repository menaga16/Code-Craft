import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s=new Scanner (System.in);
		String str=s.next();
		List<String> digarr=new ArrayList<>();
		List<Character> array=new ArrayList<>();
		char[] arr=str.toCharArray();
		String num="";
		for(char c:arr)
		{
		    if(Character.isDigit(c))
		    {
		        num+=c;
		    }
		    else{
		        if(num!="")
		        {
		            digarr.add(num);
		            num="";
		        }
		        array.add(c);
		    }
		}
		int i=0;
		int n=array.size();
		while(i<n)
		{
		    int m=Integer.parseInt(digarr.get(i));
		    for(int j=0;j<m;j++)
		    {
		        System.out.print(array.get(i));
		    }
		    i++;
		}

	}
}

/*
input:1a2b2c
output:abbcc

  */
