
public class Person {
	public String name;
	public int birth;

	public Person(String persName, int bYear) {
		name = persName;
		birth = bYear;
	}

	public String personToString() {
		String yearString = Integer.toString(birth);
		String just = name.concat(", ");
		just = just.concat(yearString);
		return just;
	}
}
