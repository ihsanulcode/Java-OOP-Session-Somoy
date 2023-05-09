
public class TestCircle {

	public static void main(String[] args) {
		
//		Circle obj = new Circle(10);
//		System.out.println("Perimeter: "+obj.getPerimeter());
//		System.out.println("Area: "+obj.getArea());
		
		ResizableCircle obj2 = new ResizableCircle(10);
		System.out.println("Perimeter: "+obj2.getPerimeter());
		System.out.println("Area: "+obj2.getArea());
		obj2.Resize(10);
		System.out.println("Perimeter: "+obj2.getPerimeter());
		System.out.println("Area: "+obj2.getArea());

	}

}
