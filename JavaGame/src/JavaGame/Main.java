package JavaGame;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	static ImageIcon grasss = new ImageIcon("Grass.png");
	static Image grass = grasss.getImage();
	static JLabel l = new JLabel(grasss);
	
	public static void main (String[] args) {
		
		JFrame f = new JFrame();
		//f.add(l);
		f.setVisible(true);
		f.setSize(16*32,16*32);
		Graphics g = f.getGraphics();
		Coords c = new Coords(); 
		Sprite s = new Sprite(c.getCoord(), 16);
		s.paint(g);
		
		
	}

}
