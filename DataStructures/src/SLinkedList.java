
class Node
{
	Node next;
	int data;
	public Node(int data)
	{
		this.data = data;
		this.next =null;
	}
}
public class SLinkedList 
{
	Node head = null;
	public void append(int data)
	{
		System.out.println("Am inside prepend");
		Node cur = new Node(data);
		if(head==null)
		{
			head = cur;
			return;
		}
		Node ele = head;
		while(ele.next!=null)
		{
			ele = ele.next;
		}
		ele.next = cur;
	}
	public void prepend(int data)
	{
		System.out.println("Am inside append");
		Node node  = new Node(data);
		//check head is null
		if(head==null)
		{
		   head = node;
		   return;
		}
		node.next = head;
		head = node;
	}
	public void deleteNodewithValue(int data)
	{
		//check head is null
		if(head==null)
		{
			return;
		}
		//if we want to delete head node itself
		if(head.data==data)
		{
			head = head.next;
			return;
		}
		Node cur = head.next;
		Node prev = head;
		while(cur.data!=data)
		{
			prev = cur;
			cur = cur.next;
		}
		prev.next = cur.next;
		
		
	}
	public void printnode()
	{
		Node cur = head;
		System.out.println("Elements of the list are");
		while(cur!=null)
		{
			System.out.print(cur.data + "  ");
			cur = cur.next;
		}
		System.out.println();
	}
	public void length()
	{
		Node cur = head;
		int len = 0;
		while(cur!=null)
		{
			len++;
			cur = cur.next;
		}
		System.out.println("Length of the list is"+len);
	}
	public void insertatgivenPos(int data,int pos)
	{
		System.out.println("Am inside insert at given pos");
		if(head==null)
		{
			Node node = new Node(data);
			head = node;
			return;
		}
		if(pos==0)
		{
			prepend(data);
			return;
		}
		Node cur =  head;
		int count = 0;
		Node node = new Node(data);
		while(cur!=null)
		{
			if(count==pos-2)
			{
				node.next = cur.next;
				cur.next = node;
				
				return;
			}
			cur = cur.next;
			count = count+1;
		}
		
		
	}
	public void deletebeginning() 
	{
		if(head==null)
		{
			System.out.println("Deletion not possible");
			return;
		}
		head = head.next;
		
	}
	public void deleteend()
	{
		if(head==null)
		{
			System.out.println("Deletion is not possible");
			return;
		}
		Node cur = head;
		Node prev = null;
		while(cur.next!=null)
		{
			prev = cur;
			cur = cur.next;
		}
		prev.next = null;
	}
	public void delatspecificpos(int pos)
	{
		if(head==null)
		{
			System.out.println("Deletion is not possible");
			return;
		}
		if(pos==0)
		{
			deletebeginning();
			return;
		}
		Node cur = head;
		int count=0;
		while(cur!=null)
		{
			if(count==pos-1)
			{
				cur.next = cur.next.next;
				return;
			}
		}
	
	}
	public void deletenodewithKey(int key)
	{
		if(head==null)
		{
			System.out.println("Deletion is not possible");
			return;
		}
		Node cur = head;
		Node prev = null;
		while(cur!=null)
		{
			if(key==cur.data)
			{
				prev.next = cur.next;
				return;
			}
			prev = cur;
			cur = cur.next;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Am inside main");
		SLinkedList list = new SLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.insertatgivenPos(100, 3);
		list.printnode();
		//list.deletebeginning();
		//list.deleteend();
		list.length();
		//list.delatspecificpos(1);
		list.deletenodewithKey(100);
		list.printnode();
		
		
	}
	

}
