import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Reversed array is");
		int last = arr.length-1;
		for(int i=0;i<n/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[last];
			arr[last] = temp;
			last = last-1;
		}
		System.out.println("After reversal");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
