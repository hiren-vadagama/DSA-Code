package DynamicPro;

public class KnapsackProblem {
	public static void main(String args[])
	{
		int weight=11;
		int[] w= {1,2,5,6,7};
		int[] v= {1,6,18,22,28};
		
		int table[][]=new int[v.length+1][weight+1];
		for(int i=0; i<=v.length; i++)
		{
			for(int j=0; j<=weight; j++)
			{
				if(i==0 || j==0)
				{
					table[i][j]=0;
				}
				else if(w[i-1]<=j)
				{
					table[i][j]=Math.max(v[i-1]+table[i-1][j-w[i-1]],table[i-1][j]);
				}
				else
				{
					table[i][j]=table[i-1][j];
				}
			}
		}
		
		for(int i=0; i<=v.length; i++)
		{
			for(int j=0; j<=weight; j++)
			{
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		
		int j=weight;
		int i=v.length;
		while(i>0)
		{
			if(table[i-1][j]==table[i][j])
			{
				i--;
			}
			else
			{
				System.out.print(">>>"+v[i-1]);
				j=j-w[i-1];
			}
		}
		
	}
}
