package GraphPro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DijstraAlgo {
	static int max=0;
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
				matrix[i][j]=0;
			}	
		}
		WeigthedGraph g[]=new WeigthedGraph[v];
		for(int i=0; i<g.length; i++)
		{
			g[i]=new WeigthedGraph(i);
		}
		for(int i=0; i<e; i++)
		{
			System.out.print("Enter Vertex");
			int tempV=sc.nextInt();
			System.out.print("Enter Edge");
			int tempE=sc.nextInt();
			g[tempV].e.add(tempE);
			System.out.print("Enter Weigth of : "+tempE);
			int tempW=sc.nextInt();
			g[tempV].w.add(tempW);
			if(max<tempW)
			{
				max=tempW;
			}
		}
		for(int i=0; i<v; i++)
		{
			g[i].printG();
		}
		
		System.out.print("Enter Start Node for Dijstra of : ");
		int start=sc.nextInt();
		System.out.print("Enter End Node for Dijstra of : ");
		int end=sc.nextInt();
		int path[]=new int[v];
		path[start]=0;
		for(int i=0; i<path.length; i++)
		{
			path[i]=max+1000;
		}
		for(int i=0; i<g[start].e.size(); i++)
		{
				path[(int) g[0].e.get(i)]=(int) g[0].w.get(i);
		}

		
		boolean visited[]=new boolean[v];

		for(int i=0; i<visited.length; i++)
		{
			visited[i]=false;
		}
		visited[start]=true;
		dijstraMethode(g,start,end,path,g[start],visited);
		
	}
	
	public static void dijstraMethode(WeigthedGraph g[],int start,int end,int path[],WeigthedGraph point, boolean[] visited)
	{
		int count=1;
		while(count!=g.length)
		{
			int min=max;
			int indexOfmin=0;
			for(int i=0; i<path.length; i++)
			{
				if(visited[i]==false)
				{
					if(path[i]<min)
					{
						min=path[i];
						indexOfmin=i;
					}
				}
			}
			System.out.println("indexOfmin  "+indexOfmin);

			visited[indexOfmin]=true;
			for(int i=0; i<path.length; i++)
			{
				for(int j=0; j<g[indexOfmin].e.size(); j++)
				{
					if((int)g[indexOfmin].e.get(j)==i)
					{
						System.out.println("i j"+g[indexOfmin].e.get(j));

						System.out.println("sum  "+((int)g[indexOfmin].w.get(j)+min)+" > "+path[i]);
						if(((int)g[indexOfmin].w.get(j)+min)<path[i])
						{

							path[i]=(int)g[indexOfmin].w.get(j)+min;
							path[i]=(int)g[indexOfmin].w.get(j)+min;
						}
					}
				}
			}
			count++;
		}
		for(int i=1; i<path.length; i++)
		{
			System.out.print(i+" : "+path[i]+" | ");
		}
	}
}
