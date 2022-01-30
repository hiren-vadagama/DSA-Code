//Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to 
//him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it 
//and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive 
//and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create 
//the words he needs.
//Given the words in the magazine and the words in the ransom note, print Yes 
//if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

package May12;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Hash_Tables_Ransom_Note {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		
		sc.nextLine();
		String mag=sc.nextLine();
		String note=sc.nextLine();
		String magArr[]=mag.split(" ");
		String noteArr[]=note.split(" ");
		List<String> magList = Arrays.asList(magArr);  
		List<String> noteList = Arrays.asList(noteArr);  
		checkMagazine(magList,noteList);
		
	}
	public static void checkMagazine(List<String> magazine, List<String> note) {
	    // Write your code here   
		magazine = magazine.stream().sorted().collect(Collectors.toList());
        note = note.stream().sorted().collect(Collectors.toList());

		
	       boolean Mainflag=true;
	        for(int i=0; i<note.size(); i++)
	            {
	                boolean flag=true;
	                int j=0;
	                while(j<magazine.size() && flag==true)
	                {
	                    if(note.get(i).equals(magazine.get(j)))
	                    {
	                        magazine.remove(magazine.get(j));
	                        flag=false;
	                    }
	                    j++;
	                }    
	                if(flag==true)
	                {
	                    Mainflag=false;
	                    break;
	                }
	            }
	        if(Mainflag!=true)
	        {
	            System.out.print("No");
	        }
	        else
	        {
	            System.out.print("Yes");    
	        }
	    }

}
