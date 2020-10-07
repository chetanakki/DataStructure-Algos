package com.utils.datastructure;

// Binary Search Tree
public class TreeDS {

	static Node rootNode = null;

	public static void main(String[] args) {

		int array[] = { 27, 14, 35, 10, 19, 31, 42 };

		for (int i = 0; i < 7; i++)
			insert(array[i]);

		//System.out.println(rootNode);
		//System.out.println(search(35));
		//inOrderTraversal(rootNode);
		
		//preOrderTraversal(rootNode);
		
		postOrderTraversal(rootNode);
	}

	public static void insert(int data) {
		if (rootNode == null) {
			rootNode = new Node();
			rootNode.setValue(data);
			return;
		} else {
			Node node = rootNode;
			while (true) {
				if (data < node.getValue()) {
					Node leftChild = node.getLeftChild();
					if (leftChild == null) {
						Node newNode = new Node();
						newNode.setValue(data);
						node.setLeftChild(newNode);
						return;
					}
					node = leftChild;
				} else {
					Node rightChild = node.getRightChild();
					if (rightChild == null) {
						Node newNode = new Node();
						newNode.setValue(data);
						node.setRightChild(newNode);
						return;
					}
					node = rightChild;
				}

			}

		}

	}

	public static Node search(int data) 
	{
		if (rootNode == null) {
			return null;
		} else {
			Node node = rootNode;
			while (true) 
			{
				if(data == node.getValue())
				{
					return node;
				}
				if (data < node.getValue()) 
				{
					if(node.getLeftChild() == null) return null;
					node = node.getLeftChild();
				} 
				else 
				{
					if(node.getRightChild() == null) return null;
					node = node.getRightChild();
				}
			}

		}
	}
	
	// left - root - right
	public static void inOrderTraversal(Node node)
	{
		if(node == null)
		{
			return;
		}
		inOrderTraversal(node.getLeftChild());
		System.out.println(node.getValue());
		inOrderTraversal(node.getRightChild());
	}
	
	// root - left - right
	public static void preOrderTraversal(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.println(node.getValue());
		inOrderTraversal(node.getLeftChild());
		inOrderTraversal(node.getRightChild());
	}
	
	// left - right - root
	public static void postOrderTraversal(Node node)
	{
		if(node == null)
		{
			return;
		}
		inOrderTraversal(node.getLeftChild());
		inOrderTraversal(node.getRightChild());
		System.out.println(node.getValue());
	}
}
