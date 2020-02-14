package notes;
/*
 * 19.8
 * Summary: This fella includes the fancy ? tool to express any type that is any type of
 * object.
 */

public class AnyWildCardDemo {
	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1); // 1 is autoboxed into new Integer(1)
		intStack.push(2);
		intStack.push(-2);

		print(intStack);
	}

	/** Prints objects and empties the stack */
	public static void print(GenericStack<?> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}