package exercise19_09;

/*
Author: Alex Johnson
Date: 02-20-2020

Description: This program uses a generic subtype to sort a list of any type that is a subtype
of comparable.
*/
import java.util.ArrayList;

public class Exercise19_09 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(24);
		list.add(4);
		list.add(42);
		list.add(5);
		Exercise19_09.<Integer>sort(list);

		System.out.print(list);
	}
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		list.sort(null); // Is this cheating? XD
	}
}
