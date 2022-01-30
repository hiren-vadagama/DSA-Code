package GraphPro;

import java.util.Scanner;

public class TopoSort {
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
		for(int i=0; i<e; i++)
		{
			g[i].printG();
		}
		topologicalSort(g);
	}
	static void topologicalSort(Graph g[])
	{
		boolean visited[]=new boolean[g.length];
		int ansNode[]=new int[g.length];
		int ansInd=0;
		for(int i=0; i<g.length; i++)
		{
			visited[i]=false;
		}
		for(int i=0; i<g.length; i++)
		{
			if(g[i].e.size()==0 && visited[i]==false)
			{
				visited[i]=true;
				int a=g[i].v;
				ansNode[ansInd]=a;
				ansInd++;
				for(int j=0; j<g.length; j++)
				{
					for(int k=0; k<g[j].e.size(); k++)
					{
						if((int)g[j].e.get(k)==a)
						{
							g[j].e.remove(k);
							i=0;							
						}

					}
				}
			}
		}
		System.out.println();
		for(int i=0; i<ansNode.length; i++)
		{
			System.out.print(ansNode[i]+" ");
		}
	}
}
