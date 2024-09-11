package JavaGame;

import java.awt.*;

import javax.swing.*;
public class Sprite extends Container{
		
		
		String name;
		ImageIcon grasss = new ImageIcon("Grass.png");
		Image grass = grasss.getImage();
		ImageIcon stones = new ImageIcon("Stone.png");
		Image stone = stones.getImage();
		ImageIcon waters = new ImageIcon("Water.png");
		Image water = waters.getImage();
		int[][] Coord;
		int worldSize;
	public Sprite(int[][] Coord, int worldSize) {
		this.Coord = Coord;
		this.worldSize = worldSize;
		}
	
	public void paint(Graphics g) {    
        for (int y = 0; y < worldSize-1;y++) {
        	for (int x = 0; x < worldSize-1;x++) {
            	if(Coord[y][x] == 1 ) {
            		
					g.drawImage(grass, x*32, y*32, null);
            	}
            	if(Coord[y][x] == 2 ) {
            		g.drawImage(water, x*32, y*32, null);
            	}
            	if(Coord[y][x] == 3 ) {
            		g.drawImage(stone, x*32, y*32, null);
            	}
        	}
		
		
        }
	}
	        public void update(Graphics g) {
        	
        }  
      
	public String getName() {
		return name;
	}
	
}
