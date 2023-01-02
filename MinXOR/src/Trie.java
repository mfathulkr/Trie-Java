
//-----------------------------------------------------
// Title: Trie class
// Author: Mehmet Fatih Ülker
// ID: 15431917506
// Section: 01
// Assignment: 04
// Description: This class is for our data structure Trie. It has root node, constructor, insert and xor methods.
//-----------------------------------------------------
import java.util.Map;

public class Trie {
	public TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(int[] word) {
		TrieNode current = root;
		for (int i = 0; i < word.length; i++) {
			int index = word[i];
			if (current.children[index] == null) {
				current.children[index] = new TrieNode();
			}
			current = current.children[index];
		}
		current.isEndOfWord = true;
	}
	
	
	//here we compare mask array elements with trie starting from root. 
	//If the numbers are same we convert index value 
	//to opposite then we put it to the result array.
	public int[] getMinimumXOR(int[] mask) {
		TrieNode current = root;
		int[] result = new int[mask.length];
		for (int i = 0; i < mask.length; i++) {
			int index = mask[i];
			if (current.children[index] == null) {
				index = index == 0 ? 1 : 0;
			}
			result[i] = index;
			current = current.children[index];
		}
		return result;
	}
}