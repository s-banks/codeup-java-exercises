import java.util.Scanner;

//from Java I control statements
public class ControlFlowExercises {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to convert a numeric grade to a letter grade?");
		System.out.print("Please input y for yes or n for no: ");
		String userInput = scanner.next();
		while (userInput.equalsIgnoreCase("y")) {
			System.out.print("What is the numeric grade? ");
			int numGrade = scanner.nextInt();
			if (numGrade >= 98) {
				System.out.println("A+");
			} else if (numGrade >=91) {
				System.out.println("A");
			} else if (numGrade >= 88) {
				System.out.println("B+");
			} else if (numGrade >=81) {
				System.out.println("B");
			} else if (numGrade >= 78) {
				System.out.println("C+");
			} else if (numGrade >=71) {
				System.out.println("C");
			}else if (numGrade >= 68) {
				System.out.println("D+");
			} else if (numGrade >=61) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
			System.out.println("Would you like to input another grade?");
			System.out.print("Please input y for yes or n for no: ");
			userInput = scanner.next();
		}
	}
}


