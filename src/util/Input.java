package util;

import java.util.Scanner;

public class Input {
	private Scanner scanner = new Scanner(System.in);
	

	public String getString() {
		System.out.println("Enter a string");
		return scanner.nextLine();
	}

	public void clearScanner() {
		scanner.nextLine();
	}

	public boolean yesNo() {
		System.out.println("Please input: Yes or No");
		String input = this.scanner.nextLine();
		input = input.toLowerCase();
		if (input.equals("yes")) {
			return true;
		} else {
			return false;
		}
	}

	public int getInt() {
		System.out.println("Enter a whole number");
		return scanner.nextInt();
	}

	public int getInt(int min, int max) {
		System.out.printf("Enter a whole number between %d and %d.%n", min, max);
		int userIn = scanner.nextInt();
		if (userIn > min && userIn < max) {
			return userIn;
		} else {
			System.err.println("Not a valid input");
			return getInt(min, max);
		}
	}

	public double getDouble() {
		System.out.println("Enter a number");
		return scanner.nextDouble();
	}

	public double getDouble(double min, double max) {
		System.out.printf("Enter a number between %f and %f.%n", min, max);
		double userIn = scanner.nextDouble();
		if (userIn > min && userIn < max) {
			return userIn;
		} else {
			System.err.println("Not a valid input");
			return getDouble(min, max);
		}
	}

}
