import java.util.Scanner;

public class ResizeArray {

	public static void main(String[] args) {
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
		int capacity = n*2;
		resize(arr,capacity);

	}

	

	private static void resize(int[] arr,  int capacity) {
		// TODO Auto-generated method stub
		int res[] = new int[capacity];
		for(int i=0;i<arr.length;i++)
		{
			res[i] = arr[i];
		}
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<capacity;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}

}
