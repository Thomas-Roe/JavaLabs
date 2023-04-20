package lab11;

public class Car {
	private String model;
	protected int speed;
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public int accelerate(int seconds) {
		speed += 5 * seconds;
		return speed;
	}
	
	public void getToSixty() {
		speed = 60;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
