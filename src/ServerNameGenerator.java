import util.Input;

public class ServerNameGenerator {
	
	
	static Input input = new Input();
	static String[] adj = {"mundane", "every", "pregnant", "economic", "majestic", "wealthy", "fresh", "clever", "innate", "repulsive"};
	static String[] nouns = {"truth", "nature", "explanation", "student", "warning", "revenue", "contribution", "analysis", "meaning", "awareness"};

	public static void main(String[] args) {
		System.out.println("Would you like a new server name");
		serverName(input.yesNo());
	}


	static String randomName(String[] array) {
		int random = (int) Math.floor((Math.random() * (array.length-1)) + 1);
		return array[random];
	}

	static public void serverName(boolean check) {
		if (check) {
			System.out.printf("Your server name is:\n\"%s - %s\"\n", randomName(adj), randomName(nouns));
			serverName(input.yesNo());
		}
	}

}
