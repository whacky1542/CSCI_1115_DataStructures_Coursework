package exercise21_09;

/*
 * Author: Alex Johnson
 * Date: 03-03-2020
 * 
 * Description: This program prompts the user for a state to then return its corresponding
 * capital. I looked around for a way to populate the map in more efficient method than the
 * for loop, but couldn't immediately find anything. Additionally, I previously had the
 * loop using a boolean value as its sentinel value for exiting the loop, but instead I
 * used the System.exit(0) for simplicity.
 */

import java.util.*;

public class Exercise21_09 {
	public static void main(String[] args) {
		String[][] stateCapital = {
				{ "Alabama", "Montgomery" }, 
				{ "Alaska", "Juneau" }, 
				{ "Arizona", "Phoenix" },
				{ "Arkansas", "Little Rock" }, 
				{ "California", "Sacramento" }, 
				{ "Colorado", "Denver" },
				{ "Connecticut", "Hartford" }, 
				{ "Delaware", "Dover" }, 
				{ "Florida", "Tallahassee" },
				{ "Georgia", "Atlanta" }, 
				{ "Hawaii", "Honolulu" }, 
				{ "Idaho", "Boise" }, 
				{ "Illinois", "Springfield" },
				{ "Indiana", "Indianapolis" }, 
				{ "Iowa", "Des Moines" }, 
				{ "Kansas", "Topeka" },
				{ "Kentucky", "Frankfort" }, 
				{ "Louisiana", "Baton Rouge" }, 
				{ "Maine", "Augusta" },
				{ "Maryland", "Annapolis" }, 
				{ "Massachusettes", "Boston" }, 
				{ "Michigan", "Lansing" },
				{ "Minnesota", "Saint Paul" }, 
				{ "Mississippi", "Jackson" }, 
				{ "Missouri", "Jefferson City" },
				{ "Montana", "Helena" }, 
				{ "Nebraska", "Lincoln" }, 
				{ "Nevada", "Carson City" },
				{ "New Hampshire", "Concord" }, 
				{ "New Jersey", "Trenton" }, 
				{ "New York", "Albany" },
				{ "New Mexico", "Santa Fe" }, 
				{ "North Carolina", "Raleigh" }, 
				{ "North Dakota", "Bismarck" },
				{ "Ohio", "Columbus" }, 
				{ "Oklahoma", "Oklahoma City" }, 
				{ "Oregon", "Salem" },
				{ "Pennsylvania", "Harrisburg" }, 
				{ "Rhode Island", "Providence" }, 
				{ "South Carolina", "Columbia" },
				{ "South Dakota", "Pierre" }, 
				{ "Tennessee", "Nashville" }, 
				{ "Texas", "Austin" },
				{ "Utah", "Salt Lake City" }, 
				{ "Vermont", "Montpelier" }, 
				{ "Virginia", "Richmond" },
				{ "Washington", "Olympia" }, 
				{ "West Virginia", "Charleston" }, 
				{ "Wisconsin", "Madison" },
				{ "Wyoming", "Cheyenne" }};
		
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < stateCapital.length; i++)
			map.put(stateCapital[i][0], stateCapital[i][1]);
		
		Scanner input = new Scanner(System.in);
		String entry;
		do {
			System.out.print("Enter a state (type 'exit' to quit): ");
			entry = input.nextLine();
			if (map.containsKey(entry))
				System.out.println("The capital of " + entry + " is " + map.get(entry) + ".\n");
			else if (entry.equals("exit"))
				System.exit(0);
			else
				System.out.println("The capital of " + entry + " was not found.\n");
		} while (true);
	}
}
