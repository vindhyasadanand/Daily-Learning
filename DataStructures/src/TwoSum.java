import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Target sum");
		int target = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int cur = target - arr[i];
			if(map.containsKey(cur))
			{
				System.out.println("Pairs are " + cur +","+arr[i]);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}

	}

}
