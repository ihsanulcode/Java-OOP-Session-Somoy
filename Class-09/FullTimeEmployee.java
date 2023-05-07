
public class FullTimeEmployee extends Employee{
	private double basic, allowance;
	
	public FullTimeEmployee() {
		
	}

	public FullTimeEmployee(
			String name, 
			int age, 
			String address, 
			String designation, 
			String department,
			double basic,
			double allowance) {
		super(name, age, address, designation, department);
		this.basic = basic;
		this.allowance = allowance;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [getBasic()=" + getBasic() + ", getAllowance()=" + getAllowance()
				+ ", getDesignation()=" + getDesignation() + ", getDepartment()=" + getDepartment() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + "]";
	}
	
	public double salary() {
		double salary = basic + (basic*(allowance/100));
		return salary;
	}
	
	

}
