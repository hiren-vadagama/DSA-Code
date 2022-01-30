package Aug;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h) {
    
    	int max=0;
	    for(int i=0; i<h.size(); i++)
	    {
	    	System.out.println("I:"+i);

	    	int temp=0;
		    for(int j=i; j<h.size(); j++)
	    	{
	    		if(h.get(i)>h.get(j))
	    		{
	    			break;
	    		}
	    		else
	    		{
	    			temp+=h.get(i);
	    		}
	    	}
		    for(int j=i-1; j>=0; j--)
	    	{
	    		if(h.get(i)>h.get(j))
	    		{
	    			break;
	    		}
	    		else
	    		{
	    			temp+=h.get(i);
	    		}
	    	}
	    	if(temp>max)
	    	{
	    		max=temp;
	    	}
	    }
		return max;

    }
    
    public static long largestRectangle2(List<Integer> h) {
        
    	List<Integer> ls=new ArrayList();
    	int result;
    	int i=0;
	    while(i<h.size())
	    {
	    	if(h.get(ls.get(0))<=h.get(i))
	    	{
	    		ls.add(i);
	    		i++;
	    	}
	    	else
	    	{
	    		int top=(int) ls.get(ls.size()-1);
	    	}
	    	
	    	return max;

    }

}

public class LargestBulding {
    public static void main(String[] args) throws IOException {

        int n = 5;

        List<Integer> h = new ArrayList();
        h.add(11);
        h.add(11);
        h.add(10);
        h.add(10);
        h.add(10);

        long result = Result.largestRectangle2(h);
        System.out.println(result);
    }
}
