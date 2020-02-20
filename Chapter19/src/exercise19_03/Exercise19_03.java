package exercise19_03;

/*
Author: Alex Johnson
Date: 02-20-2020

Description: This program uses a generic type to expand the amount of types able to be used
by a single method.
 */
import java.util.ArrayList;

public class Exercise19_03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(24);
		list.add(14);
		list.add(42);
		list.add(25);
		
		ArrayList<Integer> newList = removeDuplicates(list);

		System.out.print(newList);
	}
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> tempList = new ArrayList<>();
		for (E a : list) {
			if (!tempList.contains(a))
				tempList.add(a);
		}
		return tempList;
	}
}