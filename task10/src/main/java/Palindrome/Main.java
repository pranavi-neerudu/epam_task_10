package Palindrome;
import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the list");
		int size = sc.nextInt();
		System.out.println("Enter list");
		ArrayList<String> input = new ArrayList<String>();
		for(int i=0;i<size;i++) {
			input.add(sc.next());
		}
		System.out.println(compute(input));
		sc.close();
	}
	public static ArrayList<String> compute(ArrayList<String> a)
	{
		Palindrome palindrome=new Palindrome();
		ArrayList<String> result=new ArrayList<String>();
		for(String input: a)
		{
			if(palindrome.isPalindrome(input))
			{
				result.add(input);
			}
		}
		return result;
	}
	}

