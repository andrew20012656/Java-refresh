package innerClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GearBox mcLauren = new GearBox(6);
		GearBox.Gear first = mcLauren.new Gear(1, 12.3);
//		GearBox.Gear second = new GearBox.Gear(2, 15.4);
//		GearBox.Gear third = new McLauren.Gear(, 17.8);
		System.out.println(first.driveSpeed(1000));
		
		
	}

}
