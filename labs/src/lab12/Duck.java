package lab12;

public class Duck extends Bird implements Insurable{
	
	public Duck(String name, AnimalType animalType) {
		super(name, animalType);
	}

	@Override
	public String describeTaste() {
		// TODO Auto-generated method stub
		return getName() + ": " + "Delicate";
	}

	@Override
	public String isMainCourseDish() {
		// TODO Auto-generated method stub
		return getName() + ": " + true;
	}

	@Override
	public String getPremium() {
		// TODO Auto-generated method stub
		return getName() + ": " + "£999";
	}

	@Override
	public String expires() {
		// TODO Auto-generated method stub
		return getName() + ": " + "Tomorrow!";
	}
}
