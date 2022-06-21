package shapes;

public class Square extends Quadrilateral{

	private int side;

	public Square(int side) {

		super(side, side);
		this.side = side;
	}

	@Override
	public int getPerimeter() {
		return side * 4;
	}

	@Override
	public int getArea() {
		return side * side;
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