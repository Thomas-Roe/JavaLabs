package lab10;
import java.awt.*;

public class Sphere extends Circle {
	
	public Sphere(Color colour, Point position, double radius) {
		super(colour, position, radius);
	}
	public void getVolume() {
		double volume = (4/3) * Math.PI * (radius * radius * radius);
		System.out.println("The radius is " + radius + " and the volume is " + volume);
	}
	public void printCharacteristics() {
		getVolume();
		System.out.println("Colour is " + getColour() + " and position is " + getPosition());
	}

}
