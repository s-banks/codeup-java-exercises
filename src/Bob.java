import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play a game?");
        String userInput = in.nextLine();
        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}