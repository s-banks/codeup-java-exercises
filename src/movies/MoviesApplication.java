package movies;
import static movies.MoviesArray.findAll;
import java.util.Scanner;

public class MoviesApplication {
	public static void main(String[] args) {
		//noinspection InfiniteLoopStatement
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nWhat would you like to do?\n");
			System.out.println("0 - exit");
			System.out.println("1 - view all movies");
			System.out.println("2 - view movies in the animated category");
			System.out.println("3 - view movies in the drama category");
			System.out.println("4 - view movies in the horror category");
			System.out.println("5 - view movies in the sci-fi category\n");
			System.out.print("Enter your choice: ");
			String input = scanner.nextLine();
			switch (input) {
				case "0" -> exitApp();
				case "1" -> listAllMovies();
				case "2" -> listAllAnimated();
				case "3" -> listAllDrama();
				case "4" -> listAllHorror();
				case "5" -> listAllScifi();
			}
		}
	}



//App exit for choice 0
	public static void exitApp() {
		System.out.println("Terminating Application...");
		System.exit(0);
	}

//Choice 1 - all
	public static void listAllMovies() {
		for (Movie movies : findAll()) {
			System.out.printf("%s - %s%n", movies.getName(), movies.getCategory());
		}
	}

//Choice 2 - animated
	public static void listAllAnimated() {
		for (Movie movies : findAll()) {
			if (movies.getCategory().equalsIgnoreCase("animated")) {
				System.out.printf("%s - %s%n", movies.getName(), movies.getCategory());
			}
		}
	}

//Choice 3 - drama
	public static void listAllDrama() {
		for (Movie movies : findAll()) {
			if (movies.getCategory().equalsIgnoreCase("drama")) {
				System.out.printf("%s - %s%n", movies.getName(), movies.getCategory());
			}
		}
	}

//Choice 4 - horror
	public static void listAllHorror() {
		for (Movie movies : findAll()) {
			if (movies.getCategory().equalsIgnoreCase("horror")) {
				System.out.printf("%s - %s%n", movies.getName(), movies.getCategory());
			}
		}
	}

//Choice 5 - sci-fi
	public static void listAllScifi() {
		for (Movie movies : findAll()) {
			if (movies.getCategory().equalsIgnoreCase("scifi")) {
				System.out.printf("%s - %s%n", movies.getName(), movies.getCategory());
			}
		}
	}
}
