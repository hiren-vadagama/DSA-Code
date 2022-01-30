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



class Result4 {

    /*
     * Complete the 'countDuplicate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int countDuplicate(List<Integer> numbers) {
    // Write your code here
        List<Integer> temp=new ArrayList();
        for(int i=0; i<numbers.size(); i++)
        {
            if(!temp.contains(numbers.get(i)))
            {
                temp.add(numbers.get(i));
            }
        }
        int max=0;
        for(int i=0; i<numbers.size(); i++)
        {
        	System.out.print(temp.get(i)+" ");
        }
        for(int i=0; i<temp.size(); i++)
        {
        	int count=0;
            for(int j=0; j<numbers.size(); j++)
            {
            	if(temp.get(i)==numbers.get(j))
            	{
            		count++;
            	}
            }
            if(max>count)
            {
            	max=count;
            }
        }
        return max;
    }   

}


public class DuplicatCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = [1,3,1,4,5,6,3,2];

        int result = Result4.countDuplicate(numbers);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}