package exercise22_01;

import java.util.*;

public class Exercise22_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String entry = input.nextLine();
		
		Map<String, Integer> map = new HashMap<>();
		int pos = 0;
		while (pos < entry.length() - 1) {
			int size = 1;
			for (int i = pos; i < entry.length() - 1; i++) {
				if (entry.charAt(i) == entry.charAt(i + 1) - 1)
					size++;
				else {
					map.put(entry.substring(pos, pos + size), size);
					break;
				}
			}
			if (pos + size == entry.length())
				map.put(entry.substring(pos, pos + size), size);
			pos = pos + size;
			size = 1;
		}
		
		
	}
}
