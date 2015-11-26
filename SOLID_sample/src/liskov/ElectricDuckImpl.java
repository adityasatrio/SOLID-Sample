package liskov;

public class ElectricDuckImpl implements Duck {

	boolean isTurnedOn = Boolean.FALSE;

	@Override
	public void swim() {
		// a subclass should override the parent class' methods in a way that does not break functionality from a client's point of view 
		
		if(isTurnedOn) {
			System.out.println("ElectricDuckImpl :: kwek... kwek... kwek... ");
			System.out.println("swim :: using electronic propeler");
		}

	}

}
