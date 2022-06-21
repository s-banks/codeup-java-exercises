package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


	public Rectangle(int length, int width) {
		super(length, width);
	}

	@Override
	public int getPerimeter() {
		return (2 * this.length) + (2 * this.width);
	}

	@Override
	public int getArea() {
		return this.length * this.width;
	}

	@Override
	public void setLength() {

	}

	@Override
	public void setWidth() {

	}
}












//code removed from earlier exercise
//	protected int length;
//	protected int width;
//
//	public Rectangle (int length, int width) {
//		this.length = length;
//		this.width = width;
//	}
//
//	int getArea() {
//		return length * width;
//	}
//
//	int getPerimeter() {
//		return (2 * length) + (2 * width);
//	}