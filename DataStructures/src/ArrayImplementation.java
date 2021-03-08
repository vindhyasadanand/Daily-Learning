import java.util.Scanner;

public class ArrayImplementation 
{

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
		while(true)
		{
			System.out.println("Enter the option\n");
			System.out.println("1.Insert\n 2.Delete\n 3.Update\n 4.length\n 5.reverse");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter the index");
				        int index = sc.nextInt();
				        System.out.println("Enter the element to be inserted");
				        int ele = sc.nextInt();
				        insert(arr,index,ele);
				        
			}
			
		}
		

	}

	private static void insert(int[] arr, int index, int ele) 
	{
		//inserting at the beginning
		if(index==-1)
		{
			System.out.println("Invalid index");
		    return;
		}
		if(index==0)
		{
		   
		}
		
	}

}
