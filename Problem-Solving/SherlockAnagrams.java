package May12;

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
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
    // Write your code here
            int count=0;
            char[] ch = s.toCharArray();
            for(int i=1; i<ch.length; i++)
            {
                String tempArr[]=new String[ch.length-i+1];
                for(int j=0; j<ch.length-i+1; j++)
                {                   
                    String temp=s.substring(j,j+i);
                    tempArr[j]=temp;
                }
                for(int j=0; j<tempArr.length-1; j++)
                {
                    for(int k=j+1; k<tempArr.length; k++)
                    {
                        char[] chars = tempArr[j].toCharArray();
                        Arrays.sort(chars);
                        String sorted1 = new String(chars);
                        char[] chars2 = tempArr[k].toCharArray();
                        Arrays.sort(chars2);
                        String sorted2 = new String(chars2);
                        System.out.println(sorted1+" , "+sorted2);
                        if(sorted1.equals(sorted2))
                        {
                            count++;
                        }
                    }    
                }
            }
            return count;
    }

}

public class SherlockAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
