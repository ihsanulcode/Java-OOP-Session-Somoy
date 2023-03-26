
public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double marks = 80.124;

		if (marks >= 82) {
			System.out.println("B+");
		} else if (marks > 72 && marks < 82) {
			System.out.println("B-");
		} else if (marks > 62 && marks < 72) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}

		int time = 20;
		if (time < 20)
			System.out.println("Good day!");
		else
			System.out.println("Good noon!");
		
		//Turnary operator
		time = 11;
		String msg = (time<12)? "Good morning" : "Good noon";
		System.out.println(msg);

	}

}
