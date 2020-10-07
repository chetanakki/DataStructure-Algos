package com.utils.datastructure;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	private class Node {
		Map<Character, Node> children;

		private boolean endOfWord = false;

		private int frequency;

		public Node() {
			children = new HashMap<>();
			endOfWord = false;
			frequency = 0;
		}

		@Override
		public String toString() {
			return "Node [children=" + children + ", endOfWord=" + endOfWord + ", frequency=" + frequency + "]";
		}

		public Map<Character, Node> getChildren() {
			return children;
		}

		public void setChildren(Map<Character, Node> children) {
			this.children = children;
		}

		public boolean isEndOfWord() {
			return endOfWord;
		}

		public void setEndOfWord(boolean endOfWord) {
			this.endOfWord = endOfWord;
		}

	}

	public final Node rootNode;

	public Trie() {
		rootNode = new Node();
	}

	public void insert(String word) {
		Node current = rootNode;
		for (int i = 0; i < word.length(); i++) {
			Node node = current.getChildren().get(word.charAt(i));
			if (node == null) {
				node = new Node();
				current.getChildren().put(word.charAt(i), node);
			}
			current = node;
		}
		current.endOfWord = true;
		current.frequency += 1;
		System.out.println("Successfully inserted " + word + " in Trie !");
		System.out.println(rootNode);
	}

	public boolean search(String word) {
		Node current = rootNode;
		for (int i = 0; i < word.length(); i++) {
			Node node = current.getChildren().get(word.charAt(i));
			if (node == null) {
				System.out.println("Word: " + word + " does not exists in Trie !");
				return false;
			}
			current = node;
		}
		if (current.endOfWord == true) {
			System.out.println("Word: " + word + " exists in Trie !");
		} else {
			System.out.println("Word: " + word + " does not exists in Trie ! But this is a Prefix of another Word !");
		}
		return current.endOfWord;
	}

	// Delete word from Trie
	public void delete(String word) {
		if (search(word) == true) {
			// delete(root, word, 0);
		}
	}

	public static void main(String[] args) {
		// abcd, abef, beef, cdaz, abbc
		Trie trie = new Trie();
		trie.insert("chetan");
		trie.insert("akki");
		trie.insert("chetan");
		trie.search("chetan");
	}
}
