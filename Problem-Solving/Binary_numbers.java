package DS_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary_numbers {
	public static void main(String args[]) throws Exception, IOException
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
		    int n = Integer.parseInt(br.readLine());
		    int i=1;
		    int count=0;
		    String s="";
		    while(count!=n)
		    {
		    	s=intToBinary(i);
		    	if(s.contains("11"))
		    	{
		    		i++;
		    		continue;
		    	}
		    	else
		    	{
		    		count++;
		    	}
		    	i++;
		    }
		    System.out.println(s);
		    t--;
		}
		
	}

	public static int binaryToInteger(String binary) {
	    char[] numbers = binary.toCharArray();
	    int result = 0;
	    for(int i=numbers.length - 1; i>=0; i--)
	        if(numbers[i]=='1')
	            result += Math.pow(2, (numbers.length-i - 1));
	    return result;
	}
	
	public static String intToBinary(int n)
	{
	    String s = "";
	    while (n > 0)
	    {
	        s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
	        n = n / 2;
	    }
	    return s;
	}
}