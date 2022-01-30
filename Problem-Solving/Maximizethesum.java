package DS_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/*
 * from collections import Counter

for i in range(int(input())):
    n,k=map(int,input().split())
    lst=list(map(int,input().split()))
    a=Counter(lst)
    arr=[]
    for key,value in a.items():
        if key*value>=0:
            arr.append(key*value)
        else:
            continue
    arr.sort(reverse=True)
    print(sum(arr[0:k]))
 */
class Maximizethesum {
    public static void main(String args[] ) throws Exception {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

			int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            String inString[]=br.readLine().split(" ");
            int n=Integer.parseInt(inString[0]);
            int k=Integer.parseInt(inString[1]);
            
            long[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray(); 
            quickSort(arr,0,n-1);
            
            for(int i=0; i<n; i++)
            {
            	System.out.print(arr[i]+" ");
            	
            }
            System.out.println();
            long tem=0,sum=0;
            int i=0;
            boolean flag=false;
            List<Long> ls=new ArrayList();
            while(i<n-1)
            {
                if(arr[i]<=0)
                {
            		break;
                }   
                if(arr[i]==arr[i+1])
                {
                	if(flag)
                	{
                		sum+=arr[i];
                	}
                	else
                	{
                    	sum+=(arr[i]+arr[i+1]);
                	}
                	flag=true;
                	if(i==n-2 && flag)
                	{
                		ls.add(sum);
                    	sum=0;
                    	flag=false;
                    	i++;
                    	continue;
                	}
                	
                }
                else
                {
                    if(flag)
                    {
                    	ls.add(sum);
                    	sum=0;
                    	flag=false;
                    	i++;
                    	continue;
                    }
                    else
                    {
                    	ls.add(arr[i]);
                    }
                }

                i++;
                
            }
            
            if(arr[n-1]!=arr[n-2] && arr[n-1]>=0)
            {
            	ls.add(arr[n-1]);
            }
            long result=0;
            
            quickSortList(ls,0,ls.size()-1);
            
            int j=0;
            while( j<ls.size() && j<k)
            {
            	result+=ls.get(j);
            	j++;
            }
        	System.out.println(result);

            t--;
        }

    }
    
    static int partitionList(List<Long> a, int beg, int end)  
	{  
	      long temp;
	    int left, right, loc, flag;     
	    loc = left = beg;  
	    right = end;  
	    flag = 0;  
	    while(flag != 1)  
	    {  
	        while((a.get(loc) >= a.get(right)) && (loc!=right))  
	        right--;  
	        if(loc==right)  
	        flag =1;  
	        else if(a.get(loc)<a.get(right))  
	        {  
	            temp = a.get(loc);
	            a.set(loc, a.get(right));
	            a.set(right, temp); 
	            loc = right;  
	        }  
	        if(flag!=1)  
	        {  
	            while((a.get(loc) <= a.get(left)) && (loc!=left))  
	            left++;  
	            if(loc==left)  
	            flag =1;  
	            else if(a.get(loc) >a.get(left))  
	            {  
		            temp = a.get(loc);
		            a.set(loc, a.get(left));
		            a.set(left, temp);  
	                loc = left;  
	            }  
	        }  
	    }  
	    return loc;  
	}  
	static void quickSortList(List<Long> a, int beg, int end)  
	{  
	      
	    int loc;  
	    if(beg<end)  
	    {  
	        loc = partitionList(a, beg, end);  
	        quickSortList(a, beg, loc-1);  
	        quickSortList(a, loc+1, end);  
	    }  
	}  
    
    static int partition(long a[], int beg, int end)  
	{  
	      long temp;
	    int left, right, loc, flag;     
	    loc = left = beg;  
	    right = end;  
	    flag = 0;  
	    while(flag != 1)  
	    {  
	        while((a[loc] >= a[right]) && (loc!=right))  
	        right--;  
	        if(loc==right)  
	        flag =1;  
	        else if(a[loc]<a[right])  
	        {  
	            temp = a[loc];  
	            a[loc] = a[right];  
	            a[right] = temp;  
	            loc = right;  
	        }  
	        if(flag!=1)  
	        {  
	            while((a[loc] <= a[left]) && (loc!=left))  
	            left++;  
	            if(loc==left)  
	            flag =1;  
	            else if(a[loc] >a[left])  
	            {  
	                temp = a[loc];  
	                a[loc] = a[left];  
	                a[left] = temp;  
	                loc = left;  
	            }  
	        }  
	    }  
	    return loc;  
	}  
	static void quickSort(long a[], int beg, int end)  
	{  
	      
	    int loc;  
	    if(beg<end)  
	    {  
	        loc = partition(a, beg, end);  
	        quickSort(a, beg, loc-1);  
	        quickSort(a, loc+1, end);  
	    }  
	}  
}
