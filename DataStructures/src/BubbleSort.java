
public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[] = {9,19,23,1,2,3};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
