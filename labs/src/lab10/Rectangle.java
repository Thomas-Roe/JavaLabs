package lab10;
import java.awt.*;

public class Rectangle extends Shape {
	private int sideA, sideB;
	
	public Rectangle(Color colour, Point position, int sideA, int sideB) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	public int getArea() {
		var area = sideA * sideB;
		return area;
	}
	public int getCircumference() {
		var circum = 2 * (sideA + sideB);
		return circum;
	}
	public void getCharacteristics() {
		System.out.println("Height is " + sideA + " and width is " + sideB);
		System.out.println("Colour is " + getColour() + " and position is " + getPosition());
	}
	
}
