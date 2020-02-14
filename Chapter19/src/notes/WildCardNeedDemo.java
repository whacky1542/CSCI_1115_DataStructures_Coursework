package notes;
/*
 * 19.7
 * Summary: This program wouldn't work out due to the Number not being a subtype of Integer
 * in fact, it is the other way around. We circumvent this problem 19.8.
 */

public class WildCardNeedDemo {
	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1); // 1 is autoboxed into new Integer(1)
		intStack.push(2);
		intStack.push(-2);

		System.out.print("The max number is " + max(intStack));
	}

	/** Find the maximum in a stack of numbers */
	public static double max(GenericStack<Number> stack) {
		double max = stack.pop().doubleValue(); // Initialize max

		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (value > max)
				max = value;
		}

		return max;
	}
}