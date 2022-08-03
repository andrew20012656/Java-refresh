
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre = new Theatre("Olympian", 8, 12);
		theatre.getSeat();
		if(theatre.reservedSeat("H11")) {
			System.out.println("Please pay.");
		} else {
			System.out.println("Sorry. It's reserved.");
		}
		if(theatre.reservedSeat("H11")) {
			System.out.println("Please pay.");
		} else {
			System.out.println("Sorry. It's reserved.");
		}
	}

}
