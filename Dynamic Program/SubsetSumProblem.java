package Basic;

import java.io.*;
import java.util.*;

class SubsetSumProblem
{
 public static void main(String args[])throws IOException
 {
         int N = 6;
         int arr[]= {14,9,8,4,3,2};
         int sum = 20;

         System.out.println(isSubsetSum(arr, N, sum));
     }

	static boolean isSubsetSum(int set[],int n, int sum)
	{
		boolean subset[][] = new boolean[sum + 1][n + 1];
	
		for (int i = 0; i <= n; i++)
		{
			subset[0][i] = true;
		}
	
		for (int i = 1; i <= sum; i++)
		{
			subset[i][0] = false;
		}
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				subset[i][j] = subset[i][j - 1];
				if (i >= set[j - 1])
					subset[i][j] = subset[i][j] || subset[i - set[j - 1]][j - 1];
			}
		}
       	for (int i = 0; i <= sum; i++)
        {
       		for (int j = 0; j <= n; j++)
       		{
       			System.out.print(subset[i][j]+" ");
	        }
   			System.out.println();
		}
		return subset[sum][n];
	}
}

class Solution{
 static Boolean isSubsetSum(int N, int arr[], int sum){
     int temp=0;
     for(int i=0; i<N; i++)
     {
         for(int j=0; j<N-1-i; j++)
         {
             if(arr[j]>arr[j+1])
             {
                 int t=arr[j+1];
                 arr[j+1]=arr[j];
                 arr[j]=t;
             }
         }
     }
     for(int i=0; i<N; i++)
     {
    	 System.out.print(arr[i]+" ");
     }
     for(int i=0; i<N; i++)
     {
         if(temp+arr[i]<=sum)
         {
             temp+=arr[i];
         }
         if(temp==sum)
         {
             return true;
         }
     }
     return false;
 }
}