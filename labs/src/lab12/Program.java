package lab12;

public class Program {

	public static void main(String[] args) {
		Animal a1 = new Duck("Bert",AnimalType.Bird);
		Animal a2 = new Penguin("Simon", AnimalType.Bird);
		Animal a3 = new Fish("Flipper", AnimalType.Fish);
		Animal[] animals = {a1, a2, a3};
		for (Animal a : animals) {
			if (a instanceof Consumable) {
				Consumable aC = (Consumable) a;
				System.out.println(aC.describeTaste());
				System.out.println(aC.isMainCourseDish());;
			}
		}
		for (Animal a : animals) {
			if (a instanceof Insurable) {
				Insurable aI = (Insurable) a;
				System.out.println(aI.getPremium());
				System.out.println(aI.expires());
			}
		}
	}
}

