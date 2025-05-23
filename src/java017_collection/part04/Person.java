package java017_collection.part04;

public class Person /* extends Object */{
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", name, age);
	}
}
