package com.utils.datastructure.trie;

import java.util.HashMap;
import java.util.Stack;

public class Trie {

	private static Node rootNode;

	public static void main(String[] args) {
	
	
		create();
		// insert String
		String str = "air";
		insert(rootNode,str);
		insert(rootNode,str);
		str = "aip";
		insert(rootNode,str);
		System.out.println(rootNode);
		search("air");
		search("ai");
		search("ar");
		search("aip");
		search("ip");
		search("i");
		
	}

	private static void create() {
		rootNode = new Node();
		rootNode.charMap = new HashMap<>();
	}

	private static void delete(String str)
	{
		
	}
	
	private static boolean search(String str)
	{
		boolean found = false;
		Node node = rootNode;
		char[] charArr = str.toCharArray();
		for(int i=0;i<charArr.length;i++)
		{
			Node currentNode = node.charMap.get(charArr[i]);
			if(currentNode == null)
			{
				System.out.println("String : " +str +" - not exist");
				return found;
			}
			else
			{
				node = currentNode;
			}	
		}
		if(node.endOfWord == false)
		{
			System.out.println("String : " +str +" - is a prefix but not entrie string ");
			found = false;
		}
		if(node.endOfWord == true)
		{
			System.out.println("String : " +str +" - exist");
			System.out.println("String : " +str +" - occurs : "+node.frequency);
			found = true;
		}
		
		return found;
	}
	private static void insert(Node node, String str) {
		
		char[] charArr = str.toCharArray();
		for(int i=0;i<charArr.length;i++)
		{
			Node currentNode = node.charMap.get(charArr[i]);
			if(currentNode == null)
			{
				currentNode = new Node();
				currentNode.charMap = new HashMap<>();
				node.charMap.put(charArr[i], currentNode);
				node = currentNode;
			}
			else
			{
				node = currentNode;
			}
		}
		node.endOfWord = true;
		node.frequency ++;
	}
}
