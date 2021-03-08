import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum value is"+min);
	}

}
