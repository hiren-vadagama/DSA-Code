package GraphPro;

import java.util.ArrayList;
import java.util.List;

public class WeigthedGraph {
	int v;
	List e = new ArrayList();
	List w=new ArrayList();
	WeigthedGraph(int numV)
	{
		v=numV;
	}
	
	void printG()
	{
		System.out.println();
		System.out.print(v+" : ");
		for(int i=0; i<e.size(); i++)
		{
			System.out.print(e.get(i)+" : "+w.get(i)+" | ");
		}
	}
}
