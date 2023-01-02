//-----------------------------------------------------
// Title: TrieNode class
// Author: Mehmet Fatih Ülker
// ID: 15431917506
// Section: 01
// Assignment: 04
// Description: This is a node class for Trie. It has a children array whih is we call R and in our case R is 2 because of binary alphabet. (0, 1)
//-----------------------------------------------------
class TrieNode {
	TrieNode[] children;
	boolean isEndOfWord;

	TrieNode() {
		children = new TrieNode[2];
		isEndOfWord = false;
	}
}