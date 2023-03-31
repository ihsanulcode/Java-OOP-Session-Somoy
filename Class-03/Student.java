
public class Student {
	// data fields
	public String name;
	public int id;
	public double cgpa;
	public String dept;

	// no argument constructor
	public Student() {
		this.name = "NSUer";
		this.id = 0;
		this.cgpa = 0.0;
		this.dept = "N/A";
	}

	// argument constructor
	public Student(String name, int id, double cgpa, String dept) {
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		this.dept = dept;
	}

	// methods

	public void printInfo() {
		System.out.println(
				"Student Name: " + this.name + ", ID: " + this.id + ", Cgpa: " + this.cgpa + ", Dept: " + this.dept);
	}
	
	public String getNameId() {
		return "Student Name: " + this.name + ", ID: " + this.id;
	}

}
