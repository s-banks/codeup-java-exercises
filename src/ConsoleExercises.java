import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
       System.out.format("The value of pi is approximately %.2f%n%n", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long is your room in feet?");
        Integer userInput = Integer.valueOf(scanner.nextLine());
        System.out.println("How wide is your room in feet?");
        Integer userInput2 = Integer.valueOf(scanner.nextLine());
        Integer area = userInput * userInput2;
        Integer perim = ((userInput *= 2)  + (userInput2 *= 2));
        System.out.println("The area of your room is " + area + " and the perimeter is " + perim);
    }
}
