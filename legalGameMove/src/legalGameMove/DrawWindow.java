package legalGameMove;
import java.awt.*;
import javax.swing.*;

public class DrawWindow extends JFrame{
		
	public DrawWindow(){		
		
		super("game board");
		Container cont = getContentPane();
		//setBackground(Color.WHITE);
		DrawBoard db = new DrawBoard();
		cont.add(db, BorderLayout.CENTER);
		setSize(800,800);
		setResizable(false);
		setVisible(true);
	}
}
