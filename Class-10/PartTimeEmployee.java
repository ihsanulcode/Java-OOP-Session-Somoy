
public class PartTimeEmployee extends Employee{
	private double hours;
	private double rate;
	
	public PartTimeEmployee() {
		
	}

	public PartTimeEmployee(String name, int id,double hours,double rate) {
		super(name, id);
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double salary() {
		return hours*rate;
		
	}
	
	

}
