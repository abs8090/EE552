package legalGameMove;

import java.awt.*;

import javax.swing.*;

public class DrawBoard extends JPanel{

	int r = 0, c = 0;
	int boxSize = 80;
	
	public int getBoxSize(){
		return boxSize;
	}
	@Override
	public void paint(Graphics g){
		boolean odd = true;
		DrawCircle dc = new DrawCircle();
		for(int i = 1; i <= 8; i++){			
			for(int j = 1; j <= 8; j++){
				
				if(odd){
					g.setColor(Color.white);
					g.fillRect(r , c, j * boxSize, j * boxSize);
					System.out.println("row white: " + (c / boxSize));
					System.out.println("col white: " + (r / boxSize));
					BoardState.bs[(c / boxSize)][(r / boxSize)] = BoardState.boardState.ILLEGAL;
					
					c+= boxSize;
					odd = !odd;
					
				}else{
					g.setColor(Color.black);
					g.fillRect(r, c, j * boxSize, j * boxSize);
					
					System.out.println("row black: " + (c / boxSize));
					System.out.println("col black: " + (r / boxSize));
					BoardState.bs[(c / boxSize)][(r / boxSize)] = BoardState.boardState.AVAILABLE;
					
					if(c == (boxSize * 3) || c == (boxSize * 4)){
							
					}else{
							
						if( c < 240){
							g.setColor(Color.RED);
							dc.setPoints(r + 10,  c + 10 , 60, 60);
							BoardState.bs[(c / boxSize)][(r / boxSize)] = BoardState.boardState.RED;
							dc.draw(g);
						
						}else if( c > 320){
							g.setColor(Color.BLUE);
							dc.setPoints(r + 10,  c + 10 , 60, 60);
							BoardState.bs[(c / boxSize)][(r / boxSize)] = BoardState.boardState.BLUE;
							dc.draw(g);
							}
						}
						c+= boxSize;
						odd = !odd;
				}

			}	
				odd = !odd;
				c = 0;
				r+= 80; 
			}
		
		BoardState.showBoardState();
	}
	

}

	

