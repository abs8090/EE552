package legalGameMove;

import java.awt.Graphics;

public class DrawCircle {
	int x,y, w, h;
    public void setPoints(int x, int y, int w, int h) {
    	
    	this.x = x; this.y = y;
    	this.w = w; this.h = h;
  }
  
	public void draw(Graphics g) {
		g.fillOval(x, y, w, h);
	}
	

}
