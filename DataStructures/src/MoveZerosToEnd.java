import java.util.Scanner;

public class MoveZerosToEnd {

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
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count] = arr[i];
				count++;
			}
		}
	while(count<n)
	{
		arr[count] = 0;
		count++;
	}
	System.out.println("After moving array will be");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}

	}

}
// 0 3 1 0 9