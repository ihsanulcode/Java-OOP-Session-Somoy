
public class Tester {
	public static void main(String[] args) {

		Desh bd = new Desh("Bangladesh"); 
		Desh eng = new Desh("England", true, 200); 
		Desh hirok = bd;

		System.out.println(hirok);
		hirok.setAge(51); 
		hirok.earnFreedom(true);
		System.out.println(hirok); 
		hirok.setAge(1500); 
		eng.setAge(hirok);
		System.out.println(eng);

	}
}
