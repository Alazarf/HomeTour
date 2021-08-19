package game;

import fixtures.Room;

public class RoomManager {

	public Room startingRoom;
	public Room[] rooms;

	public RoomManager(int roomCount) {
		rooms = new Room[roomCount];
	}
	

	public void init() {
	  
	    Room Hallway = new Room(
			"Hallway",
			"Hallway",
			"Currently you're standing at the hallway." 
			+ " To your East, you find your living room. "
			+ "Your kitchen is on the West" + "\n"
			+ "And last but not least in the North you can find your Front yard.");
			this.rooms[0] = Hallway;
	        this.startingRoom = Hallway;
	        
	    Room Kitchen = new Room(
	    	"Your Kitchen",
	    	"This is your Kitchen",
	    	"This is your Kitchen, the part of the room used for cooking. To go back into the Hallway go to East");
	    	this.rooms[1] = Kitchen;
	    Room Livinroom = new Room(
	    	"Your Living Room",
	    	"This is spacious living room",
	    	"This is a spacious living room that is used mostly for entertainment purposes. "
	    	+ "To go back to Hallway you can West and to the South you find your Backyard");
	    	this.rooms[2] = Livinroom;
	    Room backyard = new Room(
	    	"Your Backyard",
	    	"Huge backyard",
	    	"Huge backyard nothing spacial here. You can go back to the house by going North");
	    	this.rooms[3] = backyard;
	    Room frontyard = new Room(
	    	 "This is your front yard.",
	    	 "At this location you can see your car and soccer ball.",
	    	 "At this location you can see your car and soccer ball.");
	    	 this.rooms[4] = frontyard;
	    	 
	  
	    	 
	}


	public Room getStartingRoom() {
		return this.startingRoom;
	}

public void setStartingRoom(Room startingRoom) {
	this.startingRoom = startingRoom;
}
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
}