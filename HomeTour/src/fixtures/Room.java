//
package fixtures;

public class Room extends Fixture {

	private Room[] exits = new Room[4];
	
	private Fixture[] items;

	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		this.exits = new Room[4];
		this.items = new Item[3]; 
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	public void setItems(Item[] items) {
		this.items = items;
		
	}
	
	public Room getExit(String direction) { 
		int index = 0;
		direction = direction.toUpperCase();
		switch (direction) {
		case "East":
			index = 0;
			break;
		case "West":
			index = 1;
			break;
		case "South":
			index = 2;
			break;
		case "North":
			index = 3;
			break;			
		}
		
		if (index >= this.exits.length || this.exits[index] == null) {
			System.out.println(" No room exist in this direction");
			
			return this;
		}
		
		return this.exits[index];
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	public Fixture[] getItems() {
		return items;
	}
	
	public void setItems(Fixture... items) {
		this.items = items;
	}
}