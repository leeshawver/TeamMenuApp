package TeamMenuApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {

	static Scanner sc = new Scanner(System.in);
	static List<Team> teams = new ArrayList<Team>();
	
	public static void main(String[] args) {

		int input = 0;
		
		while (true) {	
			printOptions();
			input = sc.nextInt();
			if (input == 1) {
				teams.add(createNewTeam());
			} else if (input == 2) {
				addPlayerToTeam();
			} else if (input == 3) {
				deletePlayer();
			} else if (input == 4) {
				describeTeam();
			} else System.out.println("Please select a valid option.");			 
		}
	}
	
	private static void printOptions() {
		System.out.println("_________________");
		System.out.println("1) Create new team");
		System.out.println("2) Add player to team");
		System.out.println("3) Delete player");
		System.out.println("4) Describe team");
	}
	
	private static Team createNewTeam() {		
		System.out.print("Enter new team name: ");
		String name = sc.next();
		return new Team(name);
	}
	
	private static void addPlayerToTeam() {
		printTeamNames();
		System.out.print("Enter name of team to which you want to add a player: ");
		String teamName = sc.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.addPlayer(createNewPlayer());
		} catch (Exception e) {
			System.out.println(e.toString());;
		}
	}
	
	private static Player createNewPlayer() {
		System.out.print("Type player's name: ");
		String name = sc.next();
		System.out.println("Type player's #: ");
		int number = sc.nextInt();
		System.out.println("Type player's position: ");
		String position = sc.next();
		return new Player(name, number, position);
	}

	private static void printTeamNames() {
		System.out.println("Teams list:");
		for (Team team : teams) {
			System.out.println(team.getName());
		}
	}
	
	private static Team findTeamByName(String name) throws Exception {
		for (Team team : teams) {
			if (team.getName().equals(name)) {
				return team;
			}
		}
		throw new Exception("Team not found: " + name);
	}
	
	private static void deletePlayer() {
		printTeamNames();
		System.out.print("Enter the team from which you want to delete a player: ");
		String teamName = sc.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
			System.out.print("Enter player name you wish to delete: ");
			String name = sc.next();
			foundTeam.removePlayer(name);
		} catch (Exception e) {
			System.out.println(e.toString());;
		}
	}
	
	private static void describeTeam() {
		printTeamNames();
		System.out.print("Enter name of team you wish to describe: ");
		String teamName = sc.next();
		try {
			Team team = findTeamByName(teamName);
			team.describe();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
