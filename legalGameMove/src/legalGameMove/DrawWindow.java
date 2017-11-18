package legalGameMove;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class DrawWindow extends JFrame{
	private DrawBoard db = new DrawBoard();
	
	public DrawWindow(){		
		
		super("game board");
		Container cont = getContentPane();		
		cont.add(db, BorderLayout.CENTER);
		setSize(640,660);
		
		MouseClicked ml = new MouseClicked();
		addMouseListener(ml);
		
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);		
	}
	
	class MouseClicked implements MouseListener{

		DrawBoard db = new DrawBoard();
		DrawCircle dc = new DrawCircle();
		int numbOfClicks = 0;
		int x, y, x2, y2, w, h, r, c, r2, c2;
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			numbOfClicks++;
			
			System.out.println("x: " + (e.getX()/db.getBoxSize())*db.getBoxSize());
			System.out.println("y: " + (e.getY()/db.getBoxSize())*db.getBoxSize());
			
			
			if(numbOfClicks == 1){
				r = ((e.getY()/db.getBoxSize())*db.getBoxSize()) / db.getBoxSize();
				c = ((e.getX()/db.getBoxSize())*db.getBoxSize()) / db.getBoxSize();
				System.out.println("1-row: " + ((e.getY()/db.getBoxSize())*db.getBoxSize()) / db.getBoxSize());
				System.out.println("1-col: " + ((e.getX()/db.getBoxSize())*db.getBoxSize()) / db.getBoxSize());
				
				x = (e.getX()/db.getBoxSize())*db.getBoxSize() + 10;
				y = (e.getY()/db.getBoxSize())*db.getBoxSize() + 30;
				w = h = db.getBoxSize() - 20;
			}
			

						
			
			System.out.println(BoardState.bs[r][c]);

			
            if(numbOfClicks == 2){
            	
				r2 = ((e.getY()/db.getBoxSize())*db.getBoxSize()) / db.getBoxSize();
				c2 = ((e.getX()/db.getBoxSize())*db.getBoxSize()) / db.getBoxSize();
				System.out.println("2-row: " + ((e.getY()/db.getBoxSize())*db.getBoxSize()) / db.getBoxSize());
				System.out.println("2-col: " + ((e.getX()/db.getBoxSize())*db.getBoxSize()) / db.getBoxSize());
				
				
				x2 = (e.getX()/db.getBoxSize())*db.getBoxSize() + 10;
				y2 = (e.getY()/db.getBoxSize())*db.getBoxSize() + 30;
				w = h = db.getBoxSize() - 20;
				
            	if(BoardState.bs[r][c] == BoardState.boardState.RED){
            	
            		if(BoardState.bs[r2][c2] != BoardState.boardState.RED){
            		
            			if(r2 == (r + 1)){
            				if(c2 == (c - 1) || c2 == (c + 1)){
            				
            					Graphics g = getGraphics();
            					
            					g.setColor(Color.BLACK);
            					BoardState.draw(g,x2 - 10, y2 - 8 , db.getBoxSize() -2 , db.getBoxSize() -2);
            					
            					g.setColor(Color.RED);
            					dc.setPoints(x2, y2 , w, h);
            					dc.draw(g);
            					BoardState.bs[r2][c2] = BoardState.boardState.RED;
                        	
            					g.setColor(Color.BLACK);
            					BoardState.draw(g,x - 10, y - 8 , db.getBoxSize() -2 , db.getBoxSize() -2);
            					BoardState.bs[r][c] = BoardState.boardState.AVAILABLE;
            				}
            			}
            		}
            		
            		System.out.println("you clicked: " + BoardState.bs[r][c]);
            		
            	}else if(BoardState.bs[r][c] == BoardState.boardState.BLUE){
            		
            		
            		if(BoardState.bs[r2][c2] != BoardState.boardState.BLUE){
            			
            			if(r2 == (r - 1)){
            				if(c2 == (c - 1) || c2 == (c + 1)){
            					
            					Graphics g = getGraphics();
            					
            					g.setColor(Color.BLACK);
            					BoardState.draw(g,x2 - 10, y2 - 8 , db.getBoxSize() -2 , db.getBoxSize() -2);
            					
            					g.setColor(Color.BLUE);
            					dc.setPoints(x2, y2 , w, h);
            					dc.draw(g);
            					BoardState.bs[r2][c2] = BoardState.boardState.BLUE;
                        	
            					g.setColor(Color.BLACK);
            					BoardState.draw(g,x - 10, y - 8 , db.getBoxSize() -2 , db.getBoxSize() -2);
            					BoardState.bs[r][c] = BoardState.boardState.AVAILABLE;
            				}
            			}
            		}
            	
            	}
            	numbOfClicks = 0;
            }
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
}
