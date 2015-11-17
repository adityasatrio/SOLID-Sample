package liskov;

public class DuckImpl implements Duck {
	@Override
	public void swim() {
		System.out.println("DuckImpl :: kwek... kwek... kwek... ");
		System.out.println("swim :: using duck feet");
	}
}
