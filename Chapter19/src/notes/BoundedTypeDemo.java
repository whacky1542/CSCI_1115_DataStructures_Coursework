package notes;
/*
 * 19.3
 * Summary: I think the use of <E extends GeometricObject> is to specify that E is a generic
 * subtype of GeometricObject. This is useful to do the following. The following entails
 * having two different objects being easily compared which improves readability and most
 * likely reliability.
 */

public class BoundedTypeDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 2);
		Circle circle = new Circle(2);

		System.out.println("Same area? " + equalArea(rectangle, circle));
	}

	public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
		return object1.getArea() == object2.getArea();
	}
}