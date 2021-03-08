import java.util.Scanner;
import java.util.Stack;

public class StringPalindromeStack {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			st.push(str.charAt(i));
		}
	   int i=0;
		while(!st.isEmpty())
		{
			if(st.pop()!=str.charAt(i))
			{
				System.out.println("Not palindrome");
				return;
			}
			i++;
			
		}
		System.out.println("palindrome");
	}

}
