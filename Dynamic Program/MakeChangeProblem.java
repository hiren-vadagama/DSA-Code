package DynamicPro;

public class MakeChangeProblem {
	public static void main(String args[])
	{
		int N=6;
		int sum=9;
		int arr[] = {3, 34, 4, 12, 5, 2};
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

		int table[][]=new int[arr.length+1][sum+1];
		for(int i=0; i<=arr.length; i++)
		{
			for(int j=0; j<=sum; j++)
			{
				if(j==0)
				{
					table[i][j]=1;
				}
				else if(i==0)
				{
					table[i][j]=0;	
				}
				else if(j<arr[i-1])
				{
					table[i][j]=table[i-1][j];

				}
				else
				{
					table[i][j]=1+table[i][j-arr[i-1]];
				}
			}
		}
		
		for(int i=0; i<=arr.length; i++)
		{
			for(int j=0; j<=sum; j++)
			{
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		
		int j=sum;
		int i=arr.length;
		int tempsum=0;
		while(i>0)
		{
			if(table[i-1][j]==table[i][j])
			{
				i--;
			}
			else
			{
				System.out.print(arr[i-1]+" ");
				tempsum+=arr[i-1];
				j=j-arr[i-1];
			}
		}
	}
}
