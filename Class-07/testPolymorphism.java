class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
}

class Student extends Person{
	private int id;
	private String dept;
	
	public Student(String name, int age,int id,String dept) {
		super(name, age);
		this.id= id;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getDept()=" + getDept() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + "]";
	}
	
}

public class testPolymorphism {

	public static void main(String[] args) {
		
		Person p = new Student("Jon Snow", 22,111,"ECE");
		System.out.println(p.toString());
		System.out.println(((Student)p).getId()); //type casting
		

	}

}
