
public class TestStudent {

	public static void main(String[] args) {
		
		String name = "Jon Doe";
		int id = 111;
		double cgpa = 3.50;
		String dept = "ECE";
		
		//object 
		Student obj1 = new Student(name,id,cgpa,dept);
		obj1.printInfo();
		
		Student obj2 = new Student("Somoy",222,3.89,"BBA");
		obj2.printInfo();
		
		Student obj3 = new Student("Jon Snow",444,4.00,"CEE");
		obj3.printInfo();
		System.out.println(obj3.getNameId());

	}

}
