package lab12;

public class Penguin extends Bird{

	public Penguin(String name, AnimalType animalType) {
		super(name, animalType);
	}

	@Override
	public String describeTaste() {
		// TODO Auto-generated method stub
		return getName() + ": " + "Cold";
	}

	@Override
	public String isMainCourseDish() {
		// TODO Auto-generated method stub
		return getName() + ": " + false;
	}
	
}
