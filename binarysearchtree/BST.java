package com.utils.datastructure.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class BST {

	private static Node rootNode;

	public static void main(String[] args) {
		rootNode = insertBST(rootNode,100);
		insertBST(rootNode,80);
		insertBST(rootNode,200);
		insertBST(rootNode,70);
		insertBST(rootNode,90);
		insertBST(rootNode,85);
		//insertBST(rootNode,100);
		//searchBST(rootNode, 100);
		System.out.println(rootNode);
		traverse();
	}

	private static boolean deleteBST(Node node, int value)
	{
		
		return false;
	}
	private static Node insertBST(Node node, int value)
	{
		if(node == null)
		{
			node = new Node();
			node.left = null;
			node.right = null;
			node.value = value;
		}
		else if( value <= node.value)
		{
			node.left = insertBST(node.left,value);
		}
		else
		{
			node.right = insertBST(node.right,value);
		}
		return node;
	}
	private static void insert(int value) {
		if (rootNode == null) {
			rootNode = new Node();
			rootNode.left = null;
			rootNode.right = null;
			rootNode.value = value;
		} else {
			Node node;
			List<Node> queue = new ArrayList<>();
			queue.add(rootNode);
			while (!queue.isEmpty()) {
				node = queue.get(0);
				queue.remove(0);
				if (node == null) {
					node = new Node();
					node.left = null;
					node.right = null;
					node.value = value;
				}
				if (value < node.value) {
					queue.add(node.left);
				} else if (value > node.value) {
					queue.add(node.right);
				}
			}
		}
	}

	private static void traverse() {
		if (rootNode == null) {
			return;
		} else {
			Node node;
			List<Node> queue = new ArrayList<>();
			queue.add(rootNode);
			while (!queue.isEmpty()) {
				node = queue.get(0);
				System.out.println(node.value);
				queue.remove(0);
				if (node.left != null && node.right != null) {
					queue.add(node.left);
					queue.add(node.right);
				} else if (node.right != null) {
					queue.add(node.right);
				} else if (node.left != null) {
					queue.add(node.left);
				}
			}
		}
	}

	// Takes O(logN)
	private static boolean searchBST(Node node, int value) {
		if (node == null) {
			return false;
		}
		if (node.value == value) {
			return true;
		} else if (value < node.value) {
			searchBST(node.left, value);
		} else {
			searchBST(node.right, value);
		}
		return false;
	}

	private static boolean search(int value) {
		if (rootNode == null) {
			return false;
		} else {
			Node node;
			List<Node> queue = new ArrayList<>();
			queue.add(rootNode);
			while (!queue.isEmpty()) {
				node = queue.get(0);
				queue.remove(0);
				if (node == null) {
					return false;
				}
				if (node.value == value) {
					return true;
				} else if (value < node.value) {
					queue.add(node.left);
				} else {
					queue.add(node.right);
				}
			}
		}
		return false;
	}
}
