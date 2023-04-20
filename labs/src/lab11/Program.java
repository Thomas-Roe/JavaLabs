package lab11;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("BMW", 0);
		Car c2 = new Racecar("Ferrari", 0, "Senna", 2);
		Car c3 = new Car("Mercedes", 0);
		Car c4 = new Racecar("McClaren", 0, "Vettel", 1.5);
		Car[] cars = {c1, c2, c3, c4};
		processCars(cars);
	}
	
	public static void processCars(Car[] cars) {
		for (Car c : cars) {
			c.getToSixty();
			if (c instanceof Racecar) {
				Racecar rc = (Racecar) c;
				rc.accelrate(2);
				System.out.println("The driver, " + rc.getDriver() + ", is going at " + rc.getSpeed() + " MPH in a " + rc.getModel());
			} else {
				c.accelerate(2);
				System.out.println("They are going at " + c.getSpeed() + "MPH in a " + c.getModel());
			}
		}
	}
}
