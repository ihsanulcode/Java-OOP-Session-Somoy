package Inheritance;

class B extends A {
	public static int x = 1;
	public int sum = 2;

	public B() {
		super();
		y = temp + 1;
		x = 3 + temp + x;
		temp -= 2;
		//System.out.println("tempB="+temp);
		//System.out.println("sumB1="+sum);
	}

	public B(B b) {
		super();
		sum = b.sum + super.sum;
		x = b.x + x;
		//System.out.println("sumB2="+sum);
	}

	public void methodB(int m, int n) {
		int[] y = { 0 };
		super.y = y[0] + this.y + m;
		x = super.y + 2 + temp - n;
		methodA(x, y);
		sum = x + y[0] + super.sum;
		System.out.println(x + " " + y[0] + " " + sum);
	}
}
