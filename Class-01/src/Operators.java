
public class Operators {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		System.out.println("a="+a+", b="+b);
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		float div = a/b;
		
		System.out.println("Summation = "+sum);
		System.out.println("Subtraction = "+sub);
		System.out.println("Multiplication = "+mul);
		System.out.println("Division = "+div);
		
		a++;
		System.out.println(a);
		b--;
		System.out.println(b);
		
		a+=1; //a = a+1;
		System.out.println(a);
		
		b-=1; //b = b-1;
		System.out.println(b);
		
		System.out.println(a==b);
		System.out.println(a!=b);
		

	}

}
