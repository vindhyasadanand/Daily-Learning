import java.util.Scanner;

class Nodes
{
	String data;
	Nodes next;
	Nodes(String data)
	{
		this.data = data;
		this.next = null;
	}
	
	
}
public class LinkedList 
{
    Nodes head = null;
    Scanner sc = new Scanner(System.in);
    void insert(int index,String value)
    {
    	Nodes node = new Nodes(value);
    	int count = 0;
    	if(index==0)
    	{
    		node.next=head;
    		node = head;
    		return;
    	}
    	else
    	{
    		Nodes cur = head;
    		while(cur!=null)
    		{
    			if(count==index-1)
    			{	
    				node.next=cur.next;
    				cur.next = node;
    				return;
    			}
    			cur = cur.next;
    		}
    	}
    	
    }
    void insertAtbeginning(	String ele)
    {
    	//System.out.println("Enter data to be inserted");
    	//String ele = sc.next();
    	Nodes node  = new Nodes(ele);
    	if(head==null)
    	{
    		head = node;
    		node = head;
    		return;
    	}
      node.next = head;
      node = head;
    }
    void insertAtend(String ele)
    {
    	Nodes node  = new Nodes(ele);
    	if(head==null)
    	{
    		head = node;
    		node = head;
    		return;
    	}
    	Nodes cur = head;
    	while(cur.next!=null)
    	{
    		cur = cur.next;
    	}
    	cur.next = node;
    }
    void printlist()
    {
    	Nodes cur = head;
    	while(cur!=null)
    	{
    		System.out.print(cur.data+" ");
    		cur = cur.next;
    	}
    	System.out.println();
    }
    int findnode(String data)
    {
    	/*if(head==null)
    	{
    		return 0;
    	}*/
    	int pos = 1;
    	int flag=1;
    	Nodes cur = head;
    	while(cur!=null)
    	{
    		if(cur.data==data)
    		{
    			
    			return pos;
    		}
    		pos++;
    		cur = cur.next;
    	}
    	return 0;
    	
    }
    void deleteNode(String data)
    {
    	if(head==null)
    	{
    		System.out.println("List is empty");
    		return;
    	}
    	if(head.data==data)
    	{
    		head = head.next;
    		return;
    	}
    
    	else
    	{	
    		Nodes cur = head;
    		Nodes prev = null;
    		while(cur!=null)
    		{
    		     if(cur.data==data)
    		     {
    		    	 System.out.println("Deleted node is "+cur.data);
    		    	 prev.next = cur.next;
    		    	 return;
    		     }
    		     prev = cur;
    		     cur = cur.next;
    		}
    	}
    	
    }
    void revercelist()
    {
    	if(head==null)
    	{
    		System.out.println("List is empty");
    	}
    	Nodes cur = head;
    	Nodes prev = null;
    	while(cur!=null)
    	{
    		Nodes nextnode = cur.next;
    		cur.next = prev;
    		prev = cur;
    		cur = nextnode;
    		
    	}
    	head = prev;
    }
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtbeginning("vindhya");
		list.insertAtend("Sandhya");
		list.insertAtend("Jaya");
		list.insertAtend("Sadu");
		list.insert(1, "Paggu");
		list.deleteNode("Paggu");
		list.printlist();
		System.out.println("index of the node"+list.findnode("Sandhya"));
		list.revercelist();
	   list.printlist();
		
	

	}

}
