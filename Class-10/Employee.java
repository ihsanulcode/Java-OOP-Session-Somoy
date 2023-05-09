
public abstract class Employee {
	private String name;
	private int id;
	
	public Employee() {
		
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public abstract double salary();

}
