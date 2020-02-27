package notes;

import java.util.*;

public class TestHashSet {
	public static void main(String[] args) {
		// Create a hash set
		Set<String> set = new HashSet<>();
		
		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		// New York is added to the set twice, but only one is stored due to the no
		// duplicates quality of the set.
		
		System.out.println(set);
		// As you can see from the console, there is no particular order to the hash set.
		// This is what a linked hash set is for.
		
		// Display the elements in the hash set
		for (String s: set) {
			System.out.print(s.toUpperCase() + ", ");
		}
		// Since the Collection interface extends the Iterable interface, for each works.
	}
}
