
public class Test {

	public static void main(String[] args) {

		Faculty obj = new Faculty("Dr. Sifat Momen", "Male", 40, "111", "ECE", 100000, "SFM1", "Professor");
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());
		System.out.println("Salary: "+obj.getSalary());
		System.out.println("Inital: "+obj.getInitial());
		
		//toString
		System.out.println(obj.toString());

	}

}
