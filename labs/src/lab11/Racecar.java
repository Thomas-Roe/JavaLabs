package lab11;

public class Racecar extends Car {
	private String driver;
	private double turboFactor;
	
	public Racecar(String model, int speed, String driver, double turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	
	public void accelrate(int seconds) {
		double accelerateTF = super.accelerate(seconds);
		accelerateTF = accelerateTF * turboFactor;
		speed += accelerateTF;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public double getTurboFactor() {
		return turboFactor;
	}

	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
}
