
public class Main {

	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		Team<SoccerPlayer> soccerTeam = new Team<>("");
		
		adelaideCrows.addPlayer(joe);
		baseballTeam.addPlayer(pat);
		soccerTeam.addPlayer(beckham);
		
		System.out.println(adelaideCrows.numPlayers()); 
	}

}
