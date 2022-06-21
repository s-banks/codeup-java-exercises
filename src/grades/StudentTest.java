package grades;

public class StudentTest {
	public static void main(String[] args) {
		Student shane = new Student("shane");
		Student joe = new Student("joe");
		shane.addGrade(56);
		shane.addGrade(92);
		shane.addGrade(87);
		shane.addGrade(79);
		joe.addGrade(84);
		joe.addGrade(91);
		joe.addGrade(72);
		joe.addGrade(87);
		System.out.println(shane.getName());
		System.out.println(shane.getGradeAverage());
		System.out.println("-----Next Student-----");
		System.out.println(joe.getName());
		System.out.println(joe.getGradeAverage());


	}
}
