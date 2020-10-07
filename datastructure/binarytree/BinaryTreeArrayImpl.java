package com.utils.datastructure.binarytree;

import java.util.Arrays;

public class BinaryTreeArrayImpl {

	static int[] node;
	static int lastUsedIndex;
	
	public static void main(String[] args) {
		createBlankBinaryTree(9);
		insert(20);
		insert(100);
		insert(3);
		insert(50);
		insert(15);
		insert(250);
		insert(35);
		insert(222);
		System.out.println(Arrays.toString(node));
		System.out.println(search(50));
		inorderTraversal(1);
	}

	
	private static void deleteBinaryTree()
	{
		node = null;
	}
	private static boolean delete(int value)
	{
		for(int i=0;i<=lastUsedIndex;i++)
		{
			if(node[i] == value)
			{
				node[i] = findDeepestNode();
				node[lastUsedIndex] =0;
				lastUsedIndex--;
				return true;
			}
		}
		return false;
	}
	private static int findDeepestNode()
	{
		return node[lastUsedIndex];
	}
	
	private static void createBlankBinaryTree(int size)
	{
		node = new int[size];
		lastUsedIndex = 0;
	}
	
	private static void insert(int value)
	{
		if(node.length == lastUsedIndex)
		{
			return;
		}
		else
		{
			node[lastUsedIndex+1] = value;
			lastUsedIndex++;
		}
	}
	
	private static boolean search(int value)
	{
		if(node.length == 0)
		{
			return false;
		}
		else
		{
			for(int i=1;i<=lastUsedIndex;i++)
			{
				if(node[i] == value)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	private static void inorderTraversal(int i)
	{
		if(i > lastUsedIndex)
		{
			return;
		}
		inorderTraversal(2 * i);
		System.out.println(node[i]);
		inorderTraversal(2 * i +1);
	}
	
	private static void preorderTraversal(int i)
	{
		if(i > lastUsedIndex)
		{
			return;
		}
		System.out.println(node[i]);
		preorderTraversal(2 * i);
		preorderTraversal(2 * i +1);
	}
	
	private static void postorderTraversal(int i)
	{
		if(i > lastUsedIndex)
		{
			return;
		}
		postorderTraversal(2 * i);
		postorderTraversal(2 * i +1);
		System.out.println(node[i]);
	}
	
	private static void levelOrderTraversal()
	{
		for(int i=0;i<=lastUsedIndex;i++)
		{
			System.out.println(node[i]);
		}
	}
}
