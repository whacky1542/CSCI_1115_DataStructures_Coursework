package exercise22_01;

/*
 * Author: Alex Johnson
 * Date: 04-09-2020
 * 
 * The time complexity of maxCon is O(n). The time complexity of the program is O(n).
 */

import java.util.*;

public class Exercise22_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String entry = input.nextLine();
		
		System.out.println("Maximum consecutive substring is " + maxCon(entry));
	}
	
	public static String maxCon(String entry) {
		
		String term = "";
		String next = entry.substring(0, 1);
		
		for (int i = 1; i < entry.length(); i++) {
			if (entry.charAt(i) > entry.charAt(i - 1)) {
				next = next.concat(Character.toString(entry.charAt(i)));
			}
			else if (next.length() > term.length()) {
				term = next;
				next = Character.toString(entry.charAt(i));
			}
			else {
				next = Character.toString(entry.charAt(i));
			}
		}
		
		if (next.length() > term.length()) {
			term = next;
		}
		
		return term;
	}
}