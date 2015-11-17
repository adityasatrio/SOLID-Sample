package liskov;

public class Implementation {

	public static void makeDuckSwim(Duck duck) {
		duck.swim();
	}
	
	public static void main(String[] args) {
		
		Duck duck = new DuckImpl();
		Implementation.makeDuckSwim(duck);
		
		System.out.println("==================================");
		
		duck = new ElectricDuckImpl();
		Implementation.makeDuckSwim(duck);
	}

	
}
