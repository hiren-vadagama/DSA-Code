package May;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class arrayManipulationSolution {

    // Complete the arrayManipulation function below.
    static long arrayMan(int n, int[][] queries) {
        int q[]=new int[n];
    	for(int i=0; i<queries.length; i++)
    	{
			for(int j=queries[i][0]-1; j<queries[i][1]-1; j++)
			{
				q[j]+=queries[i][2];
			}
    	}
    	
    	printArr(q);
		return findMax(q);


    }
    
    static void printArr(int arr[])
    {
    	for(int i=0; i<arr.length; i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
    
    static int findMax(int a[])
    {
    	int max=0;
    	for(int i=0; i<a.length; i++)
    	{
    		if(a[i]>max)
    		{
    			max=a[i];
    		}
    	}
    	return max;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
           
            for (int j = 0; j < 3; j++) {
                int queriesItem = sc.nextInt();
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayMan(n, queries);
        System.out.print("ans"+result);

    }
}
