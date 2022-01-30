package DS_Array;

import java.util.Scanner;

public class Bracketsequences {
	public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c1=0;
        int c=0;
        for(int i=0; i<str.length(); i++)
        {
        	if(str.charAt(i)=='(')
        	{
        		c1++;
        	}
        	if(str.charAt(i)==')' && c1>0)
        	{
        		c1--;
        		if(c1>=0)
        		{
        			c++;
        		}
        	}
        }
        System.out.print(c);
    }
}
