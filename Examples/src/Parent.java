
public abstract class Parent {
	
	private String city;
	
	public Parent(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public abstract void tellCity();

}
