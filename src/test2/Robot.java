package test2;

import java.awt.Graphics;

public interface Robot {
	
	public void traverseMaze();
	
	public void draw(Graphics g);
	
	public boolean hasVisited();
	
	public void turnRight(int numTurns);
	public void turnLeft(int numTurns);
	
}
