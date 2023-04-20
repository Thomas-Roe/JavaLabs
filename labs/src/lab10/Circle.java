package lab10;
import java.awt.*;

public class Circle extends Shape {
	protected double radius;
	
	public Circle(Color colour, Point position, double radius) {
		super(colour, position);
		this.radius = radius;
	}
	public void getArea() {
		double area = Math.PI * (radius * radius);
		System.out.println("The area is " + area);
	}
	public void getCircumference() {
		double circum = 2 * Math.PI * radius;
		System.out.println("The circumference is " + circum);
	}
	public void getDiameter() {
		double diam = 2 * radius;
		System.out.println("The diameter is " + diam);
	}
	public void printCharacteristics() {
		System.out.println("The radius is " + radius);
		System.out.println("Colour is " + getColour() + " and position is " + getPosition());
	}
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

}
