
public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new PartTimeEmployee("Jon Snow",23,"Dhaka","Jr. SE","Product",9,10);
		Employee e2 = new FullTimeEmployee("Jon Doe",25,"Dhaka","Sr. SE","Product",50000,20);
		
		System.out.println("PartTimeEmployee Salary: "+((PartTimeEmployee)e1).salary());
		System.out.println("FullTimeEmployee Salary: "+((FullTimeEmployee)e2).salary());
	

	}

}
