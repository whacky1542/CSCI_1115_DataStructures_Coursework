package notes;

public class Student implements Comparable<Student> {
	String name;
	int age;
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student s) {
		return this.age - s.age;
	}
	
	public String toString() {
		return "[" + name + ", " + age + "]";
	}
}
