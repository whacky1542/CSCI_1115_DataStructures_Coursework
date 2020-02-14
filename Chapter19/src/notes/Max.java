package notes;
/*
 * 19.5
 * Summary: This would give an error if "Welcome" and 23 were given. Thus reducing 
 * reliability. Instead use MaxUsingGenericType because this utilizes raw type
 * (Comparable). Correction, this throws a runtime error due to the autoboxing
 * process.
 */

public class Max {
	/** Return the maximum of two objects */
	public static Comparable max(Comparable o1, Comparable o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
}