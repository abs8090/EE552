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
		int winSize = getWidth();
		int count = 0;
		while(count <= 10){
				
			if((count % 2) == 0){
				
			for(int i = 0; i <= winSize; i++){				
				for(int j = 0; j <= winSize; j++){
				
					g.setColor(Color.black);
					g.fillRect(r , c, boxSize, boxSize);

					r+= 80;
						g.setColor(Color.white);
						g.fillRect(r, c, boxSize, boxSize);
					r+= 80;					
				}
			}
			
		}else{
			
			for(int i = 0; i <= winSize; i++){				
				for(int j = 0; j <= winSize; j++){
				
					g.setColor(Color.white);
					g.fillRect(r , c, boxSize, boxSize);

					r+= 80;
						g.setColor(Color.black);
						g.fillRect(r, c , boxSize, boxSize);
					r+= 80;					
				}
			}
		}
			r = 0;
			c+= 80; 
			count++;
	}
		

	}
}

	

