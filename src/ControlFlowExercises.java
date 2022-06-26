import java.util.Scanner;

//from Java I control statements
public class ControlFlowExercises {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Building a numeric table of powers that starts with the number 1");
		System.out.println("Please enter a number you would like to end with");
		Integer num = Integer.valueOf(scanner.nextLine());
		buildTable(num);
	}


	public static void buildTable(int num) {
		System.out.println("Number  |  Squared  |  Cubed");
		System.out.println("------  |  -------  |  -----");
		for (int i = 1; i <= num; i++) {
		System.out.println("  " + i + "     |     " + String.format("%.0f", Math.pow(i, 2)) + "     |    " + String.format("%.0f", Math.pow(i, 3)));
		}
	}


}


