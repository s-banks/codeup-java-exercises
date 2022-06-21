package shapes;

public class Square extends Quadrilateral{


	public Square(int length, int width) {
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
	public void setLength(int length) {

	}

	@Override
	public void setWidth(int width) {

	}
}















//code removed from earlier exercise
//	private int side;
//
//
//	public Square(int side) {
//		super(side, side);
//		this.side = side;
//	}
//
//	@Override
//	int getArea() {
//		return side * side;
//	}
//
//	@Override
//	int getPerimeter() {
//		return side * 4;
//	}