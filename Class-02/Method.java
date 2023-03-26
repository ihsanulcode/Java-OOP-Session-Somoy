
//Built-in methods: main(),pow(),sqrt(),nextInt()
//User define methods: sleep(), walk(), up(), down(), powerOn(), sum()

public class Method {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
		
		int ans = sum(x,y);
		int sub = sub(x,y);
		
		System.out.println("Sum: "+ans);
		System.out.println("Sub: "+sub);

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sub(int i,int j) {
		return i-j;
	}

}
