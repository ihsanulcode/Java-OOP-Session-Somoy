package Dogs;

public class Dog {
	private String color = "Black";
	private String action = "";

	// your code here

	public Dog() {

	}

	public Dog(String color) {
		this.color = color;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void printDog() {
		System.out.println(color + " dog is " + action);
	}

	public void setColor(String color) {
		this.color = color;
	}

}