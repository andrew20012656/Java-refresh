package abstraction_class;

public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		System.out.println("I'm not good at that");
	}
	
	

}
