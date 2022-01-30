package GraphPro;

import java.util.Scanner;

public class Floyd_Warshall {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		int matrix[][]=new int[v][v];
		for(int i=0; i<v; i++)
		{
			for(int j=0; j<v; j++)
			{
				matrix[i][j]=10000000;
			}	
		}
		for(int i=0; i<e; i++)
		{
			System.out.print("Enter Vertex");
			int tempV=sc.nextInt();
			System.out.print("Enter Edge");
			int tempE=sc.nextInt();
			System.out.print("Enter Weigth");
			matrix[tempV][tempE]=sc.nextInt();
		}
		floydWarshallMethod(matrix);
		for(int i=0; i<v; i++)
		{
			for(int j=0; j<v; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}	
			System.out.println();
		}
	}
	public static void floydWarshallMethod(int[][] matrix)
	{
		for(int k=0; k<matrix.length; k++)
		{
			for(int i=0; i<matrix.length; i++)
			{
				for(int j=0; j<matrix[i].length; j++)
				{
					if((matrix[i][k]+matrix[k][j])<matrix[i][j])
					{
						matrix[i][j]=matrix[i][k]+matrix[k][j];
					}
				}	
			}
		}
	}
}
