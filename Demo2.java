
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Shape [] shapeArray = new Shape[5]; //create an array of Shapes
		int numberOfShapes = 0;
		int option;
		
		do {
			System.out.println("Press 1 to add a Rectangle");
			System.out.println("Press 2 to add a Triangle");
			System.out.println("Press 3 to look at all the shapes");
			System.out.println("Press 4 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next line
			
			if(option == 1) {
				System.out.println("What is the name of your rectangle?");
				String name = keyboard.nextLine();
				
				System.out.println("What is the length of your rectangle?");
				double length = keyboard.nextDouble();
				
				System.out.println("What is the width of your rectangle?");
				double width = keyboard.nextDouble();
				
				Rectangle currentRectangle = new Rectangle();
				currentRectangle.setName(name);
				currentRectangle.setLength(length);
				currentRectangle.setWidth(width);
				
				if(numberOfShapes < shapeArray.length) {
					shapeArray[numberOfShapes] = currentRectangle;
					numberOfShapes++;
				}
				else {
					System.out.println("There is no more room for additional rectangles!");
				}
			}
			else if(option == 2) {
				System.out.println("What is the name of your triangle?");
				String name = keyboard.nextLine();
				
				System.out.println("What is the base of your triangle?");
				double base = keyboard.nextDouble();
				
				System.out.println("What is the height of your triangle?");
				double height = keyboard.nextDouble();
				
				Triangle currentTriangle = new Triangle();
				currentTriangle.setName(name);
				currentTriangle.setBase(base);
				currentTriangle.setHeight(height);
				
				if(numberOfShapes < shapeArray.length) {
					shapeArray[numberOfShapes] = currentTriangle;
					numberOfShapes++;
				}
				else {
					System.out.println("There is no more room for additional triangles!");
				}
			}
			else if(option == 3) {
				for(int index = 0; index < numberOfShapes; index++) {
					System.out.println(shapeArray[index].toString()); //can be called because toString is defined in Object and Shape class
					System.out.println("Area: " + shapeArray[index].calculateArea());
				}
			}
			else if(option == 4) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 4);
	}

}