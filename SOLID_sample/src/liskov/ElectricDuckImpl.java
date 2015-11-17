package liskov;

public class ElectricDuckImpl implements Duck {

	boolean isTurnedOn = Boolean.FALSE;

	@Override
	public void swim() {
		System.out.println("ElectricDuckImpl :: kwek... kwek... kwek... ");
		System.out.println("swim :: using electronic propeler");

	}

}
