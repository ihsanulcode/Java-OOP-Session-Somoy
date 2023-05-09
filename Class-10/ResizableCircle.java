
public class ResizableCircle extends Circle implements Resizeable{

	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void Resize(int percent) {
		this.radius = this.radius - (this.radius*(percent/100.0));
	}
}
