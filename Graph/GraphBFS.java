package GraphPro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphBFS {
	static List dfsPath = new ArrayList();
	static List queue = new ArrayList();

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
		boolean graphVisited[]=new boolean[g.length];
		for(int i=0; i<g.length; i++)
		{
			graphVisited[i]=false;
		}
		for(int i=0; i<g.length; i++)
		{
			breathFirstSearch(g[i],graphVisited,dfsPath,g);
		}
		for(int i=0; i<dfsPath.size(); i++)
		{
			System.out.print(dfsPath.get(i));
		}
	}
	
	public static List breathFirstSearch(Graph str, boolean graphVisited[], List dfsPath,Graph[] g)
	{
		if(graphVisited[str.v]==false)
		{
			dfsPath.add(str.v);
			graphVisited[str.v]=true;
			for(int i=0; i<str.e.size(); i++)
			{
				queue.add(str.e.get(i));
			}
			while(queue.size()>0)
			{
				if(graphVisited[(int) queue.get(0)]==false && queue.size()>=0)
				{
					graphVisited[(int) queue.get(0)]=true;
					dfsPath.add(queue.get(0));
					queue.remove(0);
				}
				else
				{
					break;
				}
			}
		}

		return null;
	}
}
