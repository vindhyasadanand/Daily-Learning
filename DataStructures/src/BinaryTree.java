import java.util.*;
import java.io.*;

public class BinaryTree 
{
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}


	 static Node root = null;
	
	void createnode()
	{
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node forth = new Node(40);
		Node fifth = new Node(50);
		root = first;
		first.left = second;
		first.right = third;
		second.left = forth;
		third.right = fifth;
		/*
		 *       10
		 *       |
		 *     --------
		 *     |       |
		 *     20      30
		 *     |      -----|
		 *    -----        50
		 *   |
		 *   40         
		 * 
		 * 
		 * 
		 * */
		
		
		
	}
	void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
		
	}
	void inorder(Node root)
	{

		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
	    inorder(root.right);
		
	}
	void postorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
	    System.out.println(root.data);
	    
	}
	
	public static void main(String[] args) 
	{
		BinaryTree  tree = new BinaryTree();
		tree.createnode();
		
		System.out.println("Preorder traversal will be");
		tree.preorder(root);
		
		System.out.println("Inorder traversal");
		tree.inorder(root);
		System.out.println("Postorder traversal");
		tree.postorder(root);
		
		

	}

}
