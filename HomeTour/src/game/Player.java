package game;

import fixtures.Room;

public class Player {
	Room currentRoom;
	
	//Getters and setters method
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}