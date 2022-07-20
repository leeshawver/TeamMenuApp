package TeamMenuApp;

public class Player {
	
	// fields
	private String name;
	private int playerNumber;
	private String position;
	
	// constructor
	public Player(String name, int playerNumber, String position) {
		this.name = name;
		this.playerNumber = playerNumber;
		this.position = position;
	}
	
	public void describe() {
		System.out.println("Player name: " + name
				+ ", Player #: " + playerNumber
				+ ", Player position: " + position);
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
