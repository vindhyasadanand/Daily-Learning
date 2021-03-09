import java.util.Scanner;

public class Stack 
{
	int top;
	int maxsize;
	int stack[];
	public Stack(int maxsize)
	{
		this.top = -1;
		this.maxsize = maxsize;
		stack = new int[maxsize];
	}
	public void push(int data)
	{
		if(top==maxsize)
		{
			System.out.println("Stack is full");
			return;
		}
		top++;
		stack[top] = data;
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return;
		}
		int del = stack[top];
		top--;
		System.out.println("Deleted element " + del );
		
	}
	public void printstack()
	{
		if(top==-1)
		{
			System.out.println("No elements are present in stack");
			return;
		}
		System.out.println("Elements of the stack are");
		for(int i=top;i>=0;i--)
		{
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	public void peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("top element of the stack "+stack[top]);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stack capacity");
		int maxele = sc.nextInt();
		Stack s = new Stack(maxele);
		s.push(10);
		s.push(20);
		s.push(30);
        s.printstack();
        s.peek();
	    s.pop();
	    s.printstack();

	}

}
