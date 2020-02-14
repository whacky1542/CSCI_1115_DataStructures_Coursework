package notes;
/*
 * 19.6
 * Summary: This would throw a compile error (better than a runtime error) if "welcome"
 * and 23 were to be entered. This uses the generic type of E.
 */

public class MaxUsingGenericType {
	/** Return the maximum of two objects */
	public static <E extends Comparable<E>> E max(E o1, E o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
}