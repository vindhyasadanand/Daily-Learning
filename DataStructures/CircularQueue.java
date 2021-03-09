import java.util.Scanner;

public class CircularQueue 
{
    int queue[];
    int maxval;
    int front;
    int rear;
    int count;
    CircularQueue(int maxval)
    {
        this.maxval = maxval;
        this.front = 0;
        this.rear = maxval-1;
        queue = new int[maxval];
        this.count = 0;
        
        
    }
    public void insert_rear(int data)
    {
    	if(count==maxval-1)
    	{
    		System.out.println("Queue is full");
    		return;
    	}
    	rear = (rear+1)%maxval;
    	queue[rear] = data;
    	count++;
    	
    }
    public void delete_front()
    {
         if(count==0)
         {
        	 System.out.println("Queue is empty");
     		return; 
         }
        int ele = queue[front];
        System.out.println("Deleted element is" + ele);
        count--;
        front = (front+1)%maxval;
        
         
    }
    public void display()
    {
    	if(front>rear)
    	{
    		 System.out.println("Queue is empty");
      		return; 
    	}
    	for(int i=front;i<=rear;i++)
    	{
    		System.out.print(queue[i]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity of the queue");
		int maxval = sc.nextInt();
		CircularQueue q = new CircularQueue(maxval);
		q.insert_rear(10);
		q.insert_rear(20);
		q.insert_rear(30);
		q.display();
		q.delete_front();
		q.display();
		q.delete_front();
		q.insert_rear(100);
		q.insert_rear(200);
		q.insert_rear(400);
		//q.insert_rear(500);
		q.display();

	}

}
