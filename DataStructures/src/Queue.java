import java.util.Scanner;

public class Queue
{
    int queue[];
    int rear;
    int front;
    int maxvalue;
    public Queue(int maxvalue)
    {
    	this.rear = -1;
    	this.front = 0;
    	this.maxvalue = maxvalue;
    	queue = new int[maxvalue];
    	
    }
    public void enqueue(int item)
    {
    	if(rear==maxvalue-1)
    	{
    		System.out.println("Queue is full");
    		return;
    	}
    	rear++;
    	queue[rear] = item;
    }
    public void dequeue()
    {
    	if(front>rear)
    	{
    		System.out.println("Queue empty");
    		return;

    	}
    	int del = queue[front];
    	front++;
    	System.out.println("Deleted element " +del );
    }
    public void display()
    {
    	if(rear<front)
    	{
    		System.out.println("Queue empty");
    		return;

    	}

		System.out.println("Queue elements are:");
    	for(int i=front;i<=rear;i++)
    	{
    		System.out.print(queue[i]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity of queue");
		int maxval = sc.nextInt();
		 Queue q = new Queue(maxval);
		 q.enqueue(10);
		 q.enqueue(20);
		 q.enqueue(30);
		 q.enqueue(200);
		 q.display();
		 q.dequeue();
		 q.display();
	}

}
