package movies;

public class Movie {
//Fields
	private String name;
	private String category;
//builder
	public Movie(String name, String category) {
		this.name = name;
		this.category = category;
	}
//getters
	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}
//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
