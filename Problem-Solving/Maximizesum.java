package DS_Array;

import java.util.*;

class Maximizesum {
	public static void main(String args[] ) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }

            int avg=AvgofArr(arr);
            int count=0;
            while(avg>k)
            {
                int tempArr[]=new int[arr.length+1];
                for(int i=0; i<arr.length; i++)
                {
                	tempArr[i]=arr[i];
                }
                tempArr[tempArr.length-1]=1;
                avg=AvgofArr(tempArr);
                count++;
                arr=tempArr;
                for(int i=0; i<arr.length; i++)
                {
            		System.out.print(arr[i]+" ");
                }
        		System.out.println();
            }
        
    		System.out.println("ans"+count);

            t--;
        }
    }
    public static int AvgofArr(int[] a)
    {
        int avg=0;
        for(int i=0; i<a.length; i++)
        {
            avg+=a[i];
        }
        avg=avg/a.length;
        return avg;
    }
}
