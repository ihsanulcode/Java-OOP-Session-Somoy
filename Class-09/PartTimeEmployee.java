
public class PartTimeEmployee extends Employee{
	private double hours; //3h
	private double rate; //10tk
	
	public PartTimeEmployee() {
		
	}

	public PartTimeEmployee(
			String name, 
			int age, 
			String address, 
			String designation, 
			String department,
			double hours,
			double rate) {
		super(name, age, address, designation, department);
		this.hours = hours;
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [getHours()=" + getHours() + ", getRate()=" + getRate() + ", getDesignation()="
				+ getDesignation() + ", getDepartment()=" + getDepartment() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getAddress()=" + getAddress() + "]";
	}
	
	public double salary() {
		double salary = hours*rate;
		return salary;
	}
	
	

}
