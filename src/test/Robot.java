package test;

public class Robot 
{
	enum directions{front, right, left, back,}
	//enum wall{oepned, closed,}
	
	int getCurrentRoomID(int current_x, int current_y)
	{
		int current_id;
		current_id = current_x + 4*current_y;
		return current_id;
	}
	boolean[] getSensorValues()
	{//index represents the direction where the sensor supposes to be.
	// value corresponding index represents the detection of the walls.
	// if there is a wall, return t; otherwise, false
	// if door is opened, hold value is true; otherwise, false.
	//      1
	//3  (Robot)  2
	//      4
		boolean sensorResult[] = new boolean[4];//Not use sensorResult[0] for intuitive
		
		 
		  
		return sensorResult;
	}
	void setCurrentRoom()
	{//assume the instances of rooms has been allocated.
		boolean[] sensorValues = getSensorValues();
		//int currentRoomId = getCurrentRoomID();
		if(sensorValues[1] == true)
		{//if the head of robot is true(opened)
			//Room currentRoom = new Room();
			
			
			
			
		}
		else if(sensorValues[2] == true)
		{
			
		}
		else if(sensorValues[3] == true)
		{
			
		}
		else
		{
			//something goes wrong.
		}
		
		
		
		
	}//setCurrentRoom
	
	
}//class



