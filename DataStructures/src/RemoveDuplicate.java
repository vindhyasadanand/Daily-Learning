/*program to remove duplicates from a sorted list */
class RNode{
	int data;
	RNode next;
	RNode(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class RemoveDuplicate 
{
	RNode head = null;
	public void prepend(int data)
	{
		RNode node = new RNode(data);
		if(head==null)
		{
			head = node;
			return;
		}
		node.next = head;
		head=node;
	}
	public void removeduplicate()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		RNode cur = head;
		while(cur.next!=null)
		{
			if(cur.data==cur.next.data)
			{
				cur.next = cur.next.next;
			}
			else
			{
				cur = cur.next;
			}
		}
	}
	public void printnode()
	{
		RNode cur = head;
		System.out.println("Elements of the list are");
		while(cur!=null)
		{
			System.out.print(cur.data + "  ");
			cur = cur.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		RemoveDuplicate  list = new RemoveDuplicate();
		list.prepend(40);
		list.prepend(30);
		list.prepend(30);
		list.prepend(10);
		list.prepend(10);
		list.prepend(10);
		list.printnode();
		list.removeduplicate();
		list.printnode();
	}

}
