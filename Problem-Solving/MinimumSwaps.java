package May;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minSwap(int[] arr) {
    	int count=0;
		for(int i=0; i<arr.length-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[minIndex]>arr[j])
				{
					minIndex=j;
				}
			}	
			if(minIndex!=i)
			{
				count++;
				int t=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=t;
			}
		}
    	return count;
    }
    
    static int minSwap2(int[] a) {
        int swap=0;
        for(int i=0;i<a.length;i++){
            if(i+1!=a[i]){
                int t=i;
                while(a[t]!=i+1){
                    t++;  
                }
                int temp=a[t];
                a[t]=a[i];
                a[i]=temp;
                swap++;
            }
        }
        return swap;
    }
    

    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minSwap(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
