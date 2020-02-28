package notes;

/*
 * Hash set is faster than tree set.
 */

import java.util.*;

public class TestTreeSet {
	public static void main(String[] args) {
		// Create the hash set
		Set<String> set = new HashSet<>();
		
		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		// Create a tree set from the hash set
		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println("Sorted tree set: " + treeSet);
		// Sorts it alphabetically it seems
		
		// Use the methods in SortedSet interface
		System.out.println("first(): " + treeSet.first());
		System.out.println("last(): " + treeSet.last());
		System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York"));
		System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));
		// IMPORTANT DISTINCTION: headSet is what comes before while tailSet is
		// what is and what comes after. Kind of like, head is only head while tail
		// both body and tail.
		
		// Use the methods in NavigableSet interface
		System.out.println("lower(\"P\"): " + treeSet.lower("P"));
		// Think lower element
		// Specifically, largest element less than P
		
		System.out.println("higher(\"P\"): " + treeSet.higher("P"));
		// Think higher element
		// Specifically, smallest elements greater than P
		
		System.out.println("floor(\"P\"): " + treeSet.floor("P"));
		System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
		// These two are just like lower and higher except with "or equal to"
		
		System.out.println("pollFirst(): " + treeSet.pollFirst());
		System.out.println("pollLast(): " + treeSet.pollFirst());
		System.out.println("New tree set: " + treeSet);
		// pollFirst and last effectively removes the elements
	}
}
