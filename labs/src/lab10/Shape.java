package lab10;
import java.awt.*;

public class Shape {
	private Color colour;
	private Point position;
	
	public Shape(Color colour, Point position) {
		this.colour = colour;
		this.position = position;
	}
	
	public Color getColour() {
		return colour;
	}
	public Point getPosition() {
		return position;
	}
	public void setColour(Color newColour) {
		this.colour = newColour;
	}
	public void setPosition(Point newPoint) {
		this.position = newPoint;		
	}
}

