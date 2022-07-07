import java.util.Scanner;

//From Java I Methods
public class HighLow {
	static Scanner in = new Scanner(System.in);

	public static int random() {
		return (int) ((Math.random() * 100) + 1);
	}

	public static int valid () {
		System.out.println("Enter a number between 1 and 100: ");
		int num = in.nextInt();
		if (num <= 100 && num >= 1){
			return num;
		} return valid();
	}

	public static void guess(int number, int answer, int guesses) {
		if (guesses > 0) {
			if (number == answer) {
				System.out.println("Good guess!");
			}
			if (number > answer) {
				System.out.println("Lower");
				guess(valid(), answer, (guesses - 1));
			}
			if (number < answer) {
				System.out.println("Higher");
				guess(valid(), answer, (guesses - 1));
			}
		} else {
			System.out.println("No guesses remaining.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Would you like to play a game? (Yes/No)");
		String go = in.next();

		if (go.equalsIgnoreCase("yes")) {
			int number = random();

			System.out.println("You have 10 chances to guess a number between 1 and 100");
			guess(valid(),number,10);
		}
	}
}
