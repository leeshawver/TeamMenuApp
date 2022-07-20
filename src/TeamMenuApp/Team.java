 package TeamMenuApp;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	// fields
	private List<Player> players = new ArrayList<Player>();
	private String name;
	
	// constructor
	public Team(String name) {
		this.name = name;
	}
	
	// public methods
	public void describe() {
		System.out.println("Team Name: " + name);
		for (Player player : players) {
			player.describe();
		}
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void removePlayer(String name) {
		
		for (Player player : players) {
			if (player.getName().equals(name)) {
				players.remove(player);
			}
		}		
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
