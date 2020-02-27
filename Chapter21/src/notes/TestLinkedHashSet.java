package notes;

import java.util.*;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		// Create a hash set
		Set<String> set = new LinkedHashSet<>();
		
		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		// New York is a duplicate, so it is only stored once.
		
		System.out.println(set);
		// You'll notice that this set is display just like it was entered
		
		// Display the elements in the hash set
		for (String element: set)
			System.out.print(element.toLowerCase() + ", ");
	}
}
