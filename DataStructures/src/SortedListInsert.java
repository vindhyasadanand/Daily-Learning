class LNode{
	LNode next;
	int data;
	 public LNode(int data)
	 {
		 this.data = data;
		 this.next = null;
	 }
}

public class SortedListInsert 
{
	LNode head = null;
	public void prepend(int data)
	{
		LNode node = new LNode(data);
		if(head==null)
		{
			head = node;
			return;
		}
		node.next = head;
		head=node;
	}
	public void sortedinsert(int data)
	{
		LNode node = new LNode(data);
		if(head==null)
		{
			head = node;
			return;
		}
		LNode prev = null;
		LNode cur = head;
		while(cur!=null && data>=cur.data)
		{
			prev = cur;
			cur = cur.next;
		}
		prev.next = node;
		node.next = cur;
		
	}
	public void printnode()
	{
		LNode cur = head;
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
		SortedListInsert list = new SortedListInsert();
		list.prepend(40);
		list.prepend(30);
		list.prepend(10);
		list.printnode();
		list.sortedinsert(20);
		list.sortedinsert(15);
		list.printnode();

	}

}
