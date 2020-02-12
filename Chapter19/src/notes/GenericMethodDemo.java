package notes;
/*
 * 19.2
 * Summary: Use the syntax shown to make a generic method. The syntax entails having a type
 * to be sent to the method, a call to the method using .<Type>name(data), and a header for
 * the method that is the same except with <E> before the void and (E[] listName) as the 
 * parameter. Or, you can invoke it by doing name(data) which has the compiler automatically
 * discovering the actual type.
 */

public class GenericMethodDemo {
	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		String[] strings = { "London", "Paris", "New York", "Austin" };

		GenericMethodDemo.<Integer>print(integers);
		GenericMethodDemo.<String>print(strings);
	}

	public static <E> void print(E[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}
}