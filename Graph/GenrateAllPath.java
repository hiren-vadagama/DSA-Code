package GraphPro;

import java.util.ArrayList;
import java.util.List;

public class GenrateAllPath {
	public static void main(String args[])
	{
		List path=new ArrayList();
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		 genAllPath(arr, 0,0,path);
	}
	
	static void genAllPath(int[][] arr, int i, int j,List path)
	{
		System.out.println(i+" "+j);
		path.add(arr[i][j]);
		if(i==arr.length-1 && j==arr.length-1)
		{
			System.out.println();
			for(int k=0; k<path.size(); k++)
			{
				System.out.print(path.get(k));
			}			
		}
		

		if(i+1!=arr.length)
		{
			genAllPath(arr, i+1,j,path);
		}
		else if(j+1!=arr.length)
		{
			genAllPath(arr, i,j+1,path);
		}
		else if(j+1!=arr.length && i+1!=arr.length)
		{
			genAllPath(arr, i+1,j+1,path);
		}

	}
}
