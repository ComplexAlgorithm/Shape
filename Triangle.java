
public class Triangle extends Shape {
	//instance variables
	//base 
	//height
	//should be able to include decimals/fractions
	private double base;
	private double height;
	
	//default constructor
	//call constructor of the parent class
	//set base to 1.0
	//set height to 1.0
	public Triangle() {
		super();
		base = 1.0;
		height = 1.0;
	}
	//non-static methods
	//setBase (newBase > 0.0)
	public void setBase(double newBase) {
		if(newBase > 0.0) {
			base = newBase;
		}
	}
	//getBase
	public double getBase() {
		return base;
	}
	
	
	//setHeight (newHeight > 0.0)
	public void setHeight(double newHeight) {
		if(newHeight > 0.0) {
			height = newHeight;
		}
	}
	//getHeight
	public double getHeight() {
		return height;
	}
	
	//override toString to return name, base, and height
	public String toString() {
		return super.toString() + " Base: " + base + " Height: " + height + " Area: " +calculateArea();
	}
	
	
	
	@Override
	//calculate the area using the formula Area of Triangle = 1/2 * base * height
	//return area
	public double calculateArea() {
		return .5 * base * height;
	}

}

