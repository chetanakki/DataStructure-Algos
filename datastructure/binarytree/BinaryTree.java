package com.utils.datastructure.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

	static Node rootNode;

	public static void main(String[] args) {
		insert(20);
		insert(100);
		insert(3);
		insert(50);
		insert(15);
		insert(250);
		insert(35);
		insert(222);
		System.out.println(rootNode);
		//preOrderTraversal(rootNode);
		//levelOrderTraversal(rootNode);
		System.out.println(search(222));
		rootNode = null;
	}
	
	private static boolean search(int value)
	{
		if(rootNode == null)
		{
			return false;
		}
		else
		{
			List<Node> queue = new ArrayList<>();
			queue.add(rootNode);
			Node node;
			while(!queue.isEmpty())
			{
				node = queue.get(0);
				if(node.value == value)
				{
					return true;
				}
				queue.remove(0);
				if(node.left != null && node.right != null)
				{
					queue.add(node.left);
					queue.add(node.right);
				}
				else if(node.left != null)
				{
					queue.add(node.left);
				}
				else if(node.right != null)
				{
					queue.add(node.right);
				}
			}
			queue.clear();
		}
		return false;
	}
	
	//Use queue data structure
	private static void levelOrderTraversal(Node root)
	{
		List<Node> queue = new ArrayList<>();
		queue.add(root);
		Node node;
		while(!queue.isEmpty())
		{
			node = queue.get(0);
			System.out.println(node.value);
			queue.remove(0);
			if(node.left != null && node.right != null)
			{
				queue.add(node.left);
				queue.add(node.right);
			}
			else if(node.left != null)
			{
				queue.add(node.left);
			}
			else if(node.right != null)
			{
				queue.add(node.right);
			}
		}
		queue.clear();
	}
	
	private static void insert(int value) {
		if (rootNode == null) {
			rootNode = new Node();
			rootNode.value = value;
			rootNode.left = null;
			rootNode.right = null;
		} else {
			List<Node> queue = new ArrayList<>();
			Node node = rootNode;
			queue.add(node);
			while(!queue.isEmpty())
			{
				node = queue.get(0);
				queue.remove(0);
				if(node.left != null && node.right != null)
				{
					queue.add(node.left);
					queue.add(node.right);
				}
				else if(node.left == null)
				{
					Node newNode = new Node();
					newNode.left = null;
					newNode.right = null;
					newNode.value = value;
					node.left = newNode;
					return;
				}
				else
				{
					Node newNode = new Node();
					newNode.left = null;
					newNode.right = null;
					newNode.value = value;
					node.right = newNode;
					return;
				}
			}
			
		}
	}

	// Root -> Left -> Right
	private static void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		} else {
			System.out.println(root.value);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	// Left -> Root -> Right
	private static void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		} else {
			inOrderTraversal(root.left);
			System.out.println(root.value);
			inOrderTraversal(root.right);
		}
	}

	// Left -> Right -> Root
	private static void postOrderTraversal(Node root) {
		if (root == null) {
			return;
		} else {
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
			System.out.println(root.value);
		}
	}
	
	
}
