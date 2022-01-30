package DS_Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class In_an_array {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();           
        String[] str=s.split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        int x=Integer.parseInt(str[2]);
        int y=Integer.parseInt(str[3]);
        int count=0;
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for(int i=0; i<n-1; i++)
        {
        	for(int j=i+1; j<n; j++)
            {
            	if((arr[i]+arr[j])%k==x && (arr[i]*arr[j])%k==y)
            	{
            		count++;
            	}
            }
        }
        System.out.print(count);
    }
}
