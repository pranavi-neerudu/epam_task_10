package List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alist {
	Scanner sc = new Scanner(System.in);
	void takeInput() 
	{
		System.out.println("Enter the size of the list");
		int size = sc.nextInt();
		ArrayList<String> wordarray = new ArrayList<String>();
		System.out.println("Enter the words");
		for(int i=0;i<size;i++) {
			wordarray.add(sc.next());
		}
		System.out.println(compute(wordarray));
	}
	
public	static ArrayList<String> compute(ArrayList<String> wordarray) 
	{
		ArrayList<String> resultarray = new ArrayList<String>();
		
		for(String item: resultarray)
		{
			if(item.charAt(0)=='a' && item.length()==3) {
				resultarray.add(item);
			}
		}
		return resultarray;
		
		
	}
}