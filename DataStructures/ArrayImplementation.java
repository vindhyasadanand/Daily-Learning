import java.util.Scanner;
public class ArrayImp 
{
	 static void insert(int ele,int pos,int arr[])
	    {
		   int j = arr.length-1;
		   System.out.println("j is "+j);
	        for(int i=j;i>=pos;i--)
	        {
	            
	            arr[i] = arr[i-1];
	        }
	        arr[pos-1] = ele;
	        
	    }
	    static void delete(int arr[],int index)
	    {
	        System.out.println("Deleted element is "+arr[index]);
	        for(int i=index;i<arr.length-1;i++)
	        {
	            arr[i] = arr[i+1];
	        }
	    }
	    static void display(int arr[])
	    {
	         System.out.println("Elements of the array are");
	         for(int i=0;i<arr.length;i++)
	         {
	              System.out.print(arr[i]+" ");
	         }
	    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		   
	    System.out.println("Enter number of elements of array");
	    int n = sc.nextInt();
	     int arr[] = new int[n+1];
	      System.out.println("Enter elements of array");
	      for(int i=0;i<n;i++)
	      {
	          arr[i] = sc.nextInt();
	      }
	      while(true)
	      {
	           System.out.println("Enter option\n 1.Insert\n 2.Delete\n 3.Display");
	           int choice = sc.nextInt();
	           switch(choice)
	           {
	              case 1: System.out.println("Enter the element and position");
	                      int ele = sc.nextInt();
	                      int pos = sc.nextInt();
	                     insert(ele,pos,arr);
	                     break;
	                      
	              case 2: System.out.println("Enter element index from which element is to be deleted"); 
	                      int index = sc.nextInt();
	                      delete(arr,index);
	                      break;
	             case 3: display(arr);
	                     break;
	               
	           }
	           
	          
	      }
	      
	
	}

	}


