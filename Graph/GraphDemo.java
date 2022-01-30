package GraphPro;

import java.util.Scanner;


public class GraphDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graph g[]=new Graph[v];
		for(int i=0; i<g.length; i++)
		{
			g[i]=new Graph(i);
		}
		for(int i=0; i<e; i++)
		{
			System.out.print("Enter Vertex");
			int tempV=sc.nextInt();
			System.out.print("Enter Edge");
			int tempE=sc.nextInt();
			g[tempV].e.add(tempE);
		}
		for(int i=0; i<g.length; i++)
		{
			g[i].printG();
		}
		
	}
}
