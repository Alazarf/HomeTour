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
			
	    	"\n                                    Hallway",
			
			".                            Hallway",
			
			"Currently you're standing at the hallway. \nKitchen ==> West, \nLiving room ==> East \nFront Yard ==> North " 
			+ "" + "\n"+ "");

		  
	    System.out.println("\nHome Tour Application Game start here!");
			this.rooms[0] = Hallway;
	        this.startingRoom = Hallway;
	        
		 
	        
	    Room Kitchen = new Room(
	    	"You arrived your Kitchen",
	    	"This is your Kitchen",
	    	"This is your Kitchen, the part of the room used for cooking. \nTo go back into the Hallway go to East");
	    	this.rooms[1] = Kitchen;
	    Room Livinroom = new Room(
	    	"You arrived Living Room",
	    	"This is spacious living room",
	    	"This is a spacious living room that is used mostly for entertainment purposes. "
	    	+ "\n From this direction you can go"
	    	+ "\n"
	    	+ "\n To return to Hallway ==> West "
	    	+ "\n Backyard ==> South ");
	    	this.rooms[2] = Livinroom;
	    	
	    	
	    Room backyard = new Room(
	    	"Now You are outside the house",
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