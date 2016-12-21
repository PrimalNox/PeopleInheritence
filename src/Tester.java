
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person testPerson = new Person("Garry", 1990);
		Student testStudent = new Student("Edgar", 1999, "Money Making");
		Instructor testInstructor = new Instructor("Homie", 1776, 1000000);
		System.out.println(testPerson.personToString());
		System.out.println(testStudent.studentToString());
		System.out.println(testInstructor.instToString());

	}

}
