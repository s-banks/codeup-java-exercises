import java.util.Scanner;

public class ConsoleGame {

	public static void pressEnter () {
		System.out.println("Press enter to continue");
		try{System.in.read();}
		catch(Exception e){}
	}

	public static void main(String[] args) {
		System.out.println("stuff and things");
		pressEnter();
		System.out.println("Ok, moving on");
	}






}