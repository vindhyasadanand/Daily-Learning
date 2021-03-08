import java.util.Scanner;

public class MargeSortedArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array1");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the Elements of the array1");
		for(int i=0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of the array2");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		System.out.println("Enter the Elements of the array2");
		for(int i=0;i<m;i++)
		{
			arr2[i] = sc.nextInt();
		}
		int i=0;
		int j=0;
		int k=0;
		int res[] = new int[n+m];
		System.out.println("length of res array" + res.length);
		int len = Math.min(arr1.length, arr2.length);
		while(i<len)
		{
			if(arr1[i]>=arr2[j])
			{
				res[k] = arr2[j];
				j++;
			}
			else
			{
				res[k] = arr1[i];
				i++;
				
			}
			k++;
			
		}
		while(i<arr1.length)
		{
			System.out.println("Am inside while");
			res[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			System.out.println("Am inside while");
			res[k] = arr2[j];
			j++;
			k++;
		}
		
		System.out.println("Merged Array is");
		for(i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}

}
