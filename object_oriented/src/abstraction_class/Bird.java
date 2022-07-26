package abstraction_class;

public abstract class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "is pecking");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Beathe in, breathe out, repeat");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Is flapping its wings");
	}
	
	
}
