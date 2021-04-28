
public abstract class Shape {
	//abstract classes cannot have objects constructed of them, but
	//they can be parent classes to concrete class which can
	//have object constructed of them
	
	//instance variables
	private String name;
	
	//default constructor - this constructor can only be called from a child class (concrete)
	public Shape() {
		super(); //calls the default constructor of the Object class
		name = "";
	}
	
	//non-static methods
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	//inherit the public method of Object class
	//override toString
	public String toString() {
		return "Name: " + name;
	}
	
	//abstract methods which are method headings for methods that must be implemented by child concrete classes
	//this method should calculate the area of the shape and return that value as a double
	//this must be implemented by all child concrete classes
	public abstract double calculateArea(); 
	
}
