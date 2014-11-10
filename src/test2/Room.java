package test2;

public class Room {

	private boolean[] walls;
	
	public Room(){
		
		this.walls = new boolean[4];
		walls[0] = false;
		walls[1] = false;
		walls[2] = false;
		walls[3] = false;
		
	}
	
	public void toggleRoom(int direction){
		
	}
	
	public boolean isOpen(int index){
		return true;
	}
	
	public Room getNextRoom(){
		return new Room();
	}
	
	public boolean isPath(){
		return true;
	}
}