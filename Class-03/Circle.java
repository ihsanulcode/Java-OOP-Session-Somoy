
public class Circle {
	private int radius;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double diameterOfCircle() {
		return 2.0 * this.radius;
	}

	public double perimeterOfCircle() {
		return 2.0 * Math.PI * this.radius;
	}

	public double areaOfCircle() {
		return 2 * Math.PI * this.radius;
	}
}
