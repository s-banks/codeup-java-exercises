package util;

import java.util.Scanner;

public class Input {
	private Scanner scanner = new Scanner(System.in);
	

	public String getString() {
		return this.scanner.nextLine();
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
		while (true) {
			try {
				System.out.println("Enter an integer");
				return Integer.valueOf(getString());
			} catch (NumberFormatException e) {
				System.out.println("Input is not an integer.");
			}
		}
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
		while (true) {
			try {
				System.out.println("Enter a number ");
				return Double.valueOf(getString());
			} catch (NumberFormatException e) {
				System.out.println("Input is not a number.");
			}
		}
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

	public int getBinary() {
		while (true) {
			try {
				System.out.println("Enter a binary number");
				return Integer.valueOf(getString(), 2);
			} catch (NumberFormatException e) {
				System.out.println("Input is not binary.");
			}
		}
	}

	public int getHex() {
		while (true) {
			try {
				System.out.println("Enter a hexidecimal number");
				return Integer.valueOf(getString(), 16);
			} catch (NumberFormatException e) {
				System.out.println("Input is not hexidecimal.");
			}
		}
	}

}
