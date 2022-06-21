package grades;
import java.util.ArrayList;


public class Student {
	private String name;
	private ArrayList<Integer> grades;


	public Student(String name, ArrayList<Integer> grades) {
		this.name = name;
		this.grades = new ArrayList<>();
	}

// returns the student's name
	public String getName() {
		return this.name;
	}

// adds the given grade to the grades property
	public void addGrade(int grade) {
		this.grades.add(grade);
	}

//returns the average of the students grades
	public double getGradeAverage() {
		double gradeTotal = 0;
		for ( int grade : this.grades) {
			gradeTotal += grade;
		}
		return gradeTotal / this.grades.size();
	}


}
