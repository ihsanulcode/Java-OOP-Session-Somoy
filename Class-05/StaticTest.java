
public class StaticTest {
	static int i; //static variable
	int notstatic; //non static variable

	static void print() {
		System.out.println(i);
	}

	static {
		System.out.println("code block e achiii");
	}
}
