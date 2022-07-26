package abstraction_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Yorkie");
		dog.breath();
		dog.eat();
		
		Parrot parrot = new Parrot("Parrot");
		parrot.breath();
		parrot.eat();
		parrot.fly();
		
		Penguin penguin = new Penguin("Penguin");
		penguin.fly();
	}

}
