
public class Instructor extends Person {
	public double salary;

	public Instructor(String instName, int instYear, double instSalary) {
		super(instName, instYear);
		salary = instSalary;
	}

	public String instToString() {
		String yearString = Integer.toString(birth);
		String salaryString = Double.toString(salary);
		String just = name.concat(", ");
		just = just.concat(yearString);
		just = just.concat(", ");
		just = just.concat(salaryString);
		return just;
	}

}
