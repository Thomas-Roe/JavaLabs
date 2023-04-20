package lab12;

public class Fish extends Animal implements Consumable, Insurable{
	String name;
	
	public Fish(String name, AnimalType animalType) {
		this.name = name;
		animalType = AnimalType.Fish;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getPremium() {
		// TODO Auto-generated method stub
		return getName() + ": " + "£25";
	}

	@Override
	public String expires() {
		// TODO Auto-generated method stub
		return getName() + ": " + "Next week";
	}

	@Override
	public String describeTaste() {
		// TODO Auto-generated method stub
		return getName() + ": " + "Fishy";
	}

	@Override
	public String isMainCourseDish() {
		// TODO Auto-generated method stub
		return getName() + ": " + true;
	}
}
