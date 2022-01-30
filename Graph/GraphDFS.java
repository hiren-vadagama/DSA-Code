package GraphPro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GraphDFS {
	static List dfsPath = new ArrayList();

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
		depthFirstSearch(g[0],graphVisited,dfsPath,g);
		for(int i=0; i<dfsPath.size(); i++)
		{
			System.out.print(dfsPath.get(i));
		}
	}
	
	public static List depthFirstSearch(Graph str, boolean graphVisited[], List dfsPath,Graph[] g)
	{
		dfsPath.add(str.v);
		graphVisited[str.v]=true;
		for(int i=0; i<str.e.size(); i++)
		{
			if(graphVisited[(int) str.e.get(i)]==false)
			{
				return depthFirstSearch(g[(int)str.e.get(i)],graphVisited,dfsPath,g);
			}
			
		}
		return null;
	}
}
