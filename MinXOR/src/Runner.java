
//-----------------------------------------------------
// Title: Runner class
// Author: Mehmet Fatih Ülker
// ID: 15431917506
// Section: 01
// Assignment: 04
// Description: This class is a runner class that program is executed. It handles the with input in order to make it ready for the trie and algorithm.
//-----------------------------------------------------
import java.util.Scanner;
import java.util.*;

public class Runner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[][] numbers = new int[n][9];

		// here we create trie
		Trie t = new Trie();

		for (int i = 0; i < n; i++) {

			String f = scan.next();

			for (int j = 0; j < 9; j++) {
				char c = f.charAt(j);
				int a = Character.getNumericValue(c);
				numbers[i][j] = a;
			}

		}

		// we insert the data to trie
		for (int[] number : numbers) {
			t.insert(number);
		}
		
		//we get mask
		
		String mask = scan.next();
		int [] maskArray = new int [9];
		
		for (int j = 0; j < 9; j++) {
			char c = mask.charAt(j);
			int a = Character.getNumericValue(c);
			maskArray[j] = a;
		}
		
		int [] result = t.getMinimumXOR(maskArray);
		
		for(int i = 0; i < 9; i++) {
			System.out.print(result[i]);
		}

	}

}
