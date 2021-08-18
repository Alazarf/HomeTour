
package game;

import java.util.Scanner;


public class Main extends RoomManager {

	public Main(int roomCount) {
		super(roomCount);
	}

	private static RoomManager manager = new RoomManager(5);
	static int gameRunning = 1;
	
	public static void main(String[] args) {

		manager.init();
		Player player = new Player();
		player.setCurrentRoom(manager.startingRoom);
		
		while (gameRunning == 1) {

			Main.printRoom(player);
			String[] input = Main.collectInput();
			Main.parse(input, player);
		}
		if (gameRunning == 0) {
			System.out.println("Game Over!");
		}
	}


	private static void printRoom(Player player) {
	player.getCurrentRoom();

	System.out.println(player.currentRoom.getName() + "\n");
	System.out.println(player.currentRoom.getLongDescription() + "\n");
	}

	private static String[] collectInput() {

			Scanner scanner = new Scanner(System.in);
	        System.out.println("\nTo start the game please type Go and Direction. \nFor Example:\"Go East\"");

	        String input = scanner.nextLine();
	        String[] strArr = input.split(" "); 

	        if (gameRunning == 0) {
				scanner.close();
			}
	        return strArr;
	}
	
		
	public static void parse(String[] input, Player player ) {
		if (input[0].equals("Quit")) {
			gameRunning = 0;
			}
		switch (input[0]) {
		case "Go" :
			Main.movement(input, player);
			break;
		case "Move" :
			Main.movement(input, player);
			break;
		case "G" :
			Main.movement(input, player);
			break;
		case "M" :
			Main.movement(input, player);
			break;
		default:
			System.out.println("\nLooks like you misspelled!\nPlease follow the given direction!\n");
			break;
		}
	}
	
	public static void movement(String[] input, Player player ) {
		if(player.currentRoom.equals(manager.rooms[0])) {
			switch (input[1]) {
			case "East":
				System.out.println("Now You're walking to the Living room\n");
				player.setCurrentRoom(manager.rooms[2]);
				break;
			case "West":
				System.out.println("Now You're walking to the Kitchen\n");
				player.setCurrentRoom(manager.rooms[1]);
				break;
			case "South":
				System.out.println("There is no way out this way please turn around.\n");
				break;
			case "North":
				System.out.println("Great! Now, you're walkig toward front yard.\n");
				player.setCurrentRoom(manager.rooms[4]);
				break;
			default:
				System.out.println("\nLooks like you misspelled!\nPlease follow the given direction!\n");
				break;
			}
			
		} else if (player.currentRoom.equals(manager.rooms[1])) {
		
			switch (input[1]) {
			case "East":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "West":
				System.out.println("There is no way out this way please turn around.\n");
				break;
			case "South":
				System.out.println("You walk back into the Hallway\n");
				player.setCurrentRoom(manager.rooms[0]);
				break;
			case "North":
				System.out.println("There is no way out this way please turn around\n");
				break;
			default:
				System.out.println("\nLooks like you misspelled!\nPlease follow the given direction!\n");
				break;
			}
		} else if(player.currentRoom.equals(manager.rooms[2])) {
		
			switch (input[1]) {
			case "East":
				System.out.println("You walk out into the backyard\n");
				player.setCurrentRoom(manager.rooms[3]);
				break;
			case "West":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "South":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "North":
				System.out.println("You turn around and walk back into the Hallway.\n");
				player.setCurrentRoom(manager.rooms[0]);
				break;
			default:
				System.out.println("\nLooks like you misspelled!\nPlease follow the given direction!\n");
				break;
			}
		} else if(player.currentRoom.equals(manager.rooms[3])) {
		
			switch (input[1]) {
			case "East":
				System.out.println("There is no way out this way please turn around.\n");
				break;
			case "West":
				System.out.println("There is no way out this way please turn around.\n");
				break;
			case "South":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "North":
				System.out.println("Great! Now, you're back in the house.\n");
				player.setCurrentRoom(manager.rooms[2]);
				break;
			default:
				System.out.println("\nLooks like you misspelled!\nPlease follow the given direction!\n");
				break;
			}
		} else if(player.currentRoom.equals(manager.rooms[4])) {
		
			switch (input[1]) {
			case "East":
				System.out.println("Great! Now, you're back in the house.\n");
				player.setCurrentRoom(manager.rooms[0]);
				break;
			case "West":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "South":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "North":
				System.out.println("It's raining outside. Please go back toward the East.\n");
				break;
			default:
				System.out.println("\nLooks like you misspelled!\nPlease follow the given direction!\n");
				break;
			}
		}
	}
	
}