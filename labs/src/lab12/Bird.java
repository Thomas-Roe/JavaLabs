package lab12;

public abstract class Bird extends Animal implements Consumable{
	String name;
	
	public Bird(String name, AnimalType animalType){
		this.name = name;
		animalType = AnimalType.Bird;
	}

	public String getName() {
		return name;
	} 
	
}
