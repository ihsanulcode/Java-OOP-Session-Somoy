
public class Desh {
	private int age;
	private boolean freedom;
	private String name;

	// Your code here
	public Desh(String name) {
		this.name = name;
	}

	public Desh(String name, boolean freedom, int age) {
		this.name = name;
		this.freedom = freedom;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void earnFreedom(boolean freedom) {
		this.freedom = freedom;
	}

	public void setAge(Desh obj) {
		this.age = obj.age;
	}

	public String toString() {
		return "Freedom is " + freedom + " for " + name + " with an age " + age;
	}
}
