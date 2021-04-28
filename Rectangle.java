
public class Rectangle extends Shape {
	//instance variables
	private double length;
	private double width;
	
	//default constructor
	public Rectangle() {
		super(); 
		length = 1.0;
		width = 1.0;
	}
	
	//non-static methods
	public void setLength(double newLength) {
		if(newLength > 0.0) {
			length = newLength;
		}
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double newWidth) {
		if(newWidth > 0.0) {
			width = newWidth;
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	//override the toString method from the Shape class 
	public String toString() {
		return super.toString() + " Length: " + length + " Width: " + width + " Area: " + calculateArea();
	}
	
	@Override
	//this class must provide an implementation or definition to the abstract method defined 
	//in the Shape class
	//take the abstract method in the Shape class and make it concrete
	public double calculateArea() {
		// TODO Auto-generated method stub
		//double area = length * width;
		return length * width;
	}

}
