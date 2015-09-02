
public class Child extends Parent {
	
	private String name;
	
	public Child(String name) {
		super("Seattle");
		this.name = name;
	}
	
	public Child(String name, String city) {
		super(city);
		this.name = name;
	}

	@Override
	public void tellCity() {
		System.out.println("My city is " + getCity());
	}

}
