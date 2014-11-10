package test2;

import java.util.List;

public class Maze {

	private int columns;
	private int rows;
	private Room[][] roomsList;
	
	public Maze(int columns, int rows){
		this.columns = columns;
		this.rows = rows;
		
		this.roomsList = new Room[columns][rows];
		
		for(int i = 0; i < columns; i++){
			for(int k = 0; k < rows; k++){
				
				roomsList[i][k] = new Room();
				
			}
		}
		
	}
	
	public void createWall(int column, int row, int direction){
		roomsList[column][row].
	}
	
	public void deleteWall(){}
	
	public void drawMaze(){}
	
	public void setRows(int rows){
		this.rows = rows;
	}
	
	public int getRows(){
		return rows;
	}
	
	public void setColumns(int columns){
		this.columns = columns;
	}
	
	public int getColumns(){
		return columns;
	}
	
	public boolean isWall(){
		return true;
	}
}
