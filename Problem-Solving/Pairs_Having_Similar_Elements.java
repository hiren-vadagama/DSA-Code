package DS_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Pairs_Having_Similar_Elements {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         long out_ = SimilarElementsPairs(A,N);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long SimilarElementsPairs(int[] A,int N){
        int count=0;
        List<ArrayList<Integer>> myList = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<N-1; i++)
        {
            for(int j=i+1; j<N; j++)
            {
                if((A[i]+1)==A[j])
                {
                    ArrayList<Integer> list1 = new ArrayList<Integer>();
                    list1.add(i);
                    list1.add(j);
                    myList.add(list1);
                    count++;
                }
            }   
        }


        for(int i=0; i<myList.size()-1; i++)
        {
        	ArrayList<Integer> list1=myList.get(i);
            for(int j=i+1; j<myList.size(); j++)
            {
                List<Integer> list2=myList.get(j);
                if(list1.get(0)==list2.get(0) || list1.get(0)==list2.get(1) || list1.get(1)==list2.get(0) || list1.get(1)==list2.get(1))
                {
                    count++;
                }
            }   
        }
        return count;
    }
}

/*
n=int(input())
a=list(map(int,input().split()))
a.sort()
count=0
string=""
for i in range(len(a)-1):
    if a[i]==a[i+1]-1:
        string=string+"1"
    elif a[i]==a[i+1]:
        string=string+"0"
    else:
        string=string+"-"

list2=string.split("-")

for i in list2: 
    if "1"in i:
        z=len(i)
        count=count+(z*(z+1)) /2

print(int(count))
*/