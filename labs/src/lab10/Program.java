package lab10;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(Color.BLACK,new Point(20, 30),5,6);
		//r1.getCharacteristics();
		Circle c1 = new Circle (Color.pink, new Point(10, 10), 8);
		//c1.getArea();
		//c1.getCircumference();
		Sphere s1 = new Sphere(Color.BLUE,new Point(5,5),5);
		//s1.getVolume();
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(r1);
		shapes.add(c1);
		shapes.add(s1);
		for (Shape shape : shapes) {
			System.out.println("the colour of " + shape + " is " + shape.getColour());
			System.out.println("the position of " + shape + " is " + shape.getPosition());
		}
	}
}
