package shapes;

import util.Input;

public class CircleApp {
	public static void main(String[] args) {
		Input input = new Input();
		boolean loop = true;
		while (loop) {
			System.out.println("Please enter the radius of a circle");
			double radius = input.getDouble();
			Circle circle = new Circle(radius);
			System.out.printf("The circle has a radius of: %.2f, a circumference of: %.1f, and an area of: %.1f\n",
					circle.getRadius(),
					circle.getCircumference(),
					circle.getArea());
			System.out.println("Would you like to do this again? (Y)es or (N)o");
			input.clearScanner();
			loop = input.yesNo();
		}

	}
}