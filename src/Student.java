
public class Student extends Person {
	public String major;

	public Student(String stuName, int stuYear, String maj) {
		super(stuName, stuYear);
		major = maj;
	}

	public String studentToString() {
		String yearString = Integer.toString(birth);
		String just = name.concat(", ");
		just = just.concat(yearString);
		just = just.concat(", ");
		just = just.concat(major);
		return just;
	}
}
