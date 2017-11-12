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
		//setBackground(Color.WHITE);
		
		cont.add(db, BorderLayout.CENTER);
		setSize(800,800);
		
		MouseClicked ml = new MouseClicked();
		addMouseListener(ml);
		
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);		
	}
	
	class MouseClicked implements MouseListener{

		DrawCircle dc = new DrawCircle();
		int x, y, w, h;
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("x: " + (e.getX()/db.getBoxSize())*db.getBoxSize());
			System.out.println("y: " + (e.getY()/db.getBoxSize())*db.getBoxSize());
			
			x = (e.getX()/db.getBoxSize())*db.getBoxSize() + 10;
			y = (e.getY()/db.getBoxSize())*db.getBoxSize() + 30;
			w = h = db.getBoxSize() - 20;

            Graphics g = getGraphics();
            g.setColor(Color.RED);
            dc.setPoints(x, y , w, h);
            dc.draw(g);
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
