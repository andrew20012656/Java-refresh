
public class Main {
	public static void main(String[] args) {
		Player player = new Player();
		player.name = "Tim";
		player.health = 20;
		player.weapon = "sword";
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Health remaining: " + player.healthRemaining());
		
		damage = 11;
		player.loseHealth(damage);
		System.out.println("Health remaining: " + player.healthRemaining());
		
		EnhancedPlayer player1 = new EnhancedPlayer("Tim", 50, "Sword");
		System.out.ln("Initial health is " + player1.getHealth());
		
	}
}
