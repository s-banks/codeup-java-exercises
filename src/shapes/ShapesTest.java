package shapes;

public class ShapesTest {
	public static void main(String[] args) {

		Measurable myShape;
		Rectangle rectangle = new Rectangle(5, 4);
		myShape = rectangle;
		System.out.println(myShape.getPerimeter());
		System.out.println(myShape.getArea());


		Square square = new Square(4);
		myShape = square;

		System.out.println(myShape.getPerimeter());
		System.out.println(myShape.getArea());

	}
}
















// code removed from earlier exercise
//	Rectangle box1 = new Rectangle(5, 4);
//		System.out.println(box1.getArea());
//		System.out.println(box1.getPerimeter());
//
//		Rectangle box2 = new Square(5);
//		System.out.println(box2.getArea());
//		System.out.println(box2.getPerimeter());