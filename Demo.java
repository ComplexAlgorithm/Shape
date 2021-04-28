public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape myShape = new Shape();
		//System.out.println(myShape.calculateArea());
		
		//Shape myShape = new Shape();
		//System.out.println(myShape.calculateArea());
		
		Rectangle myRectangle = new Rectangle();
		myRectangle.setName("Rectangle 1");
		myRectangle.setLength(2.0);
		myRectangle.setWidth(4.0);
		System.out.println(myRectangle.toString());
		System.out.println("Area: " + myRectangle.calculateArea());
		
		Triangle myTriangle = new Triangle();
		myTriangle.setName("Triangle 1");
		myTriangle.setBase(3.0);
		myTriangle.setHeight(6.0);
		System.out.println(myTriangle.toString());
		System.out.println(myTriangle.calculateArea());
		
		Shape s = myRectangle; 
		s.setName("S");
		//s.setLength(10.0); //The type of the reference determines which methods can be called on an object
		myRectangle.setLength(10.0);
		System.out.println(s.calculateArea()); //Methods once they are called are run on the actual objects not on the references
		
		s = myTriangle;
		s.setName("S");
		//s.setBase(12.0);
		System.out.println(s.calculateArea());
	}

}