
public class Employee extends Person {
	private String designation;
	private String department;

	public Employee() {

	}

	public Employee(String name, int age, String address, String designation, String department) {
		super(name, age, address);
		this.designation = designation;
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [getDesignation()=" + getDesignation() + ", getDepartment()=" + getDepartment()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + "]";
	}
	
	

}
