package notes;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Peter", 65));
		list.add(new Student("Jill", 50));
		list.add(new Student("Sarah", 34));
		Collections.sort(list);
		System.out.print(list + " ");
		Collections.sort(list, new StudentComparator1());
		System.out.println(list);
	}
}