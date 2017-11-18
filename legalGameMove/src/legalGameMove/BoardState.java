package legalGameMove;

import java.awt.Color;
import java.awt.Graphics;

public class BoardState {

	public static enum boardState { AVAILABLE, RED, BLUE, ILLEGAL}
	
	public static boardState[][] bs = new boardState[8][8];
	
	public static void draw(Graphics g, int x, int y, int w, int h){
	
		g.setColor(Color.BLACK);
		g.fillRect(x, y, w, h);
	}
	
	public static void showBoardState(){
		
		for(int x = 0; x < BoardState.bs.length; x++){
			for(int y = 0; y < BoardState.bs.length; y++){
				
				System.out.println("x: " + x + " y: " + y + " " + BoardState.bs[x][y]);
			}
		}
	}
}
