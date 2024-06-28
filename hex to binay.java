/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {

		
		String str="1AB3";
		str=str.toUpperCase();
	/*	
		int decimal=Integer.parseInt(val,16);
		String res=Integer.toBinaryString(decimal);
		System.out.println(res);
		*/
		
		String[] Hextobi={"0000", "0001","0010", "0011",
		                    "0100","0101","0110","0111",
		                     "1000","1001","1010","1011",
		                        "1100","1101","1110","1111"};
		char[] val=str.toCharArray();             
		for(char c:val)
		{
		    if(c>'0'&&c<'9')
		    {
		         System.out.print(Hextobi[c-'0']);
		    }
		    else{
		        System.out.print(Hextobi[(c-'A')+10]);
		    }
		}
	}
}
