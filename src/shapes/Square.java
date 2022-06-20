package shapes;

public class Square extends Rectangle{

	private int side;


	public Square(int side) {
		super(side, side);
		this.side = side;
	}

	@Override
	int getArea() {
		return side * side;
	}

	@Override
	int getPerimeter() {
		return side * 4;
	}
}
