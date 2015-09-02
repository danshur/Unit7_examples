
public class Person {

	private String firstName;
	private String lastName;

	public Person(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public String getName() {
		return firstName + " " + lastName;
	}
}
