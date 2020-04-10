package exercise22_03;

/*
 * Author: Alex Johnson
 * Date: 04-10-2020
 * 
 * This program has the time complexity of O(n).
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise22_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = "";
		String s2 = "";
		
		System.out.print("Enter a string s1: ");
		s1 = input.nextLine();
		System.out.print("Enter a string s2: ");
		s2 = input.nextLine();
		
		System.out.println("Indexes that matched: " + scan(s1, s2).toString());
	}
	
	public static ArrayList<Integer> scan(String s1, String s2) {
		ArrayList<Integer> matches = new ArrayList<>();
		
		for (int i = 0; i <= s1.length() - s2.length(); i++) {
			System.out.println("if " + s2 + " = " + s1.substring(i, i + s2.length()));
			if (s2.equals(s1.substring(i, i + s2.length()))) {
				matches.add(i);
			}
		}
		
		return matches;
	}
}
