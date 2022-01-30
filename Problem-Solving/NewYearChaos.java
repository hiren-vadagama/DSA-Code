package May;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    static void printList(List<Integer> q)
    {
        for(int i=0; i<q.size(); i++)
        {
            System.out.print(q.get(i));
        }
        System.out.println();
    }
    
    public static void minimumBribes(List<Integer> q) {
        int count=0;
        boolean ansFlag=false;
        boolean Qui=false;
        while(!Qui)
        {
            boolean tempQui=true;
            int i=0; 
            boolean flag1=false;
            boolean flag2=false;
            while(i<q.size()-1)
            {
                if(q.get(i)>q.get(i+1))
                {
                    tempQui=false;
                    count++;
                    int temp=q.get(i+1);
                    q.set(i+1, q.get(i));
                    q.set(i, temp);
                    if(flag1==false)
                    {
                        flag1=true;
                        i++;
                        continue;
                    }
                    if(flag2==false && flag1==true)
                    {
                        flag2=true;
                        i++;
                        continue;

                    }
                    if(flag2==true && flag1==true)
                    {
                        ansFlag=true;
                        Qui=true;
                        System.out.println("Too chaotic");
                        break;
                    }
                }
                else
                {
                     flag1=false;
                     flag2=false;
                     i++;
                }
            }
            if(tempQui)
            {
                Qui=true;
                break;
            }
        }
        if(!ansFlag)
        {
            System.out.println(count);    
        }
        
    }

}


public class NewYearChaos {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        IntStream.range(0, t).forEach(tItr -> {
            try {
                
                int n = sc.nextInt();
                List<Integer> q = new ArrayList<Integer>();
                for(int i=0; i<n; i++)
                {
                    q.add(sc.nextInt());
                }

                Result.minimumBribes(q);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
