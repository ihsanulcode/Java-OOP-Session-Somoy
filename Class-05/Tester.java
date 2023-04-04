
public class Tester {
	public static void main(String args[]) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		st1.i = 5;
		st1.print();
		
		st2.i = 6;
		st2.print();
		
		st1.print();
		

		StaticTest.i = 15;
		StaticTest.print();
		st1.print();
		st2.print();

	}
}
