package DS_Array;

import java.util.*;

class MaximizeModuloFun {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {        	
            int n=sc.nextInt();
            int k=sc.nextInt();
            
            sc.nextLine();
            String num = sc.nextLine();
            String strK=num;
            int count=0;
            long max=Long.parseLong(num)%k;

        	if(n>1)
        	{
                while(count<n)
                {
                	String temp="";
                	temp=strK.substring(0,n-count-1)+strK.substring(n-count,n);
                	long tempInt=Long.parseLong(temp);
                	long modInt=tempInt%k;
                	if(modInt>max)
                	{
            			max=modInt;
                	}
                	count++;
                }
        	}
            

        	System.out.println(max);

            t--;
        }

    }
}
