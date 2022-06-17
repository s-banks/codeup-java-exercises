import java.util.Arrays;

public class ArraysExercises {

	public static String[] people = new String[3];

	public static String[] addPerson (String[] string, String add1) {
		String[] added = Arrays.copyOf(string, string.length + 1);
		added [string.length] = add1;
		return added;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(numbers);

		fill(people, "tom");

		String[] check = addPerson(ArraysExercise.people,"robert");

		for (String person : ArraysExercise.people) {
			System.out.println(person);
		}
		for (String person : check) {
			System.out.println(person);
		}
	}

}
