package com.utils.datastructure.trie;

import java.util.Map;

public class Node
{
	public Map<Character,Node> charMap;
	
	public boolean endOfWord;
	
	public int frequency;

	@Override
	public String toString() {
		return "Node [charMap=" + charMap + ", endOfWord=" + endOfWord + ", frequency=" + frequency + "]";
	}
}
