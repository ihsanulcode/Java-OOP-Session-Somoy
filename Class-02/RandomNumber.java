import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// Random class
		Random rand = new Random();
		
		int n = rand.nextInt(10-2+1)+2; //(upper-lower+1)+lower
		System.out.println(n);
		

	}

}
