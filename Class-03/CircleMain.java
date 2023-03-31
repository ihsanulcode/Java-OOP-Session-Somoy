
public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(1);
		Circle c2 = new Circle(5);

		System.out.println("First Circle:");
		System.out.println("Radius = " + c1.getRadius());
		System.out.println("Diameter = " + c1.diameterOfCircle());
		System.out.println("Perimeter = " + c1.perimeterOfCircle());
		System.out.println("Area = " + c1.areaOfCircle());

		System.out.println("Second Circle:");
		System.out.println("Radius = " + c2.getRadius());
		System.out.println("Diameter = " + c2.diameterOfCircle());
		System.out.println("Perimeter = " + c2.perimeterOfCircle());
		System.out.println("Area = " + c2.areaOfCircle());

	}

}
