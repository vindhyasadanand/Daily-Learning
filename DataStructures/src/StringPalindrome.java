import java.util.Scanner;

public class StringPalindrome 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		String initial = str;
		String rev ="";
		for(int i=0;i<str.length();i++)
		{
			rev = str.charAt(i) + rev;
		}
		System.out.println("reversed string " + rev );
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=rev.charAt(i))
			{
				System.out.println("Not palindrome");
				return;
			}
		}
		System.out.println("Palindrome");

	}

}
