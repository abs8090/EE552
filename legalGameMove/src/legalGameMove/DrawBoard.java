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
		boolean odd = true;
		
		while(count <= 10){		
			
			for(int i = 0; i <= winSize; i++){				
				for(int j = 0; j <= winSize; j++){
			
					if(odd){
						g.setColor(Color.black);
						g.fillRect(r , c, boxSize, boxSize);
						r+= 80;
				
					}else{
						g.setColor(Color.white);
						g.fillRect(r, c, boxSize, boxSize);
						r+= 80;
			
				}
				odd = !odd;
			}
			odd = !odd;
			}
		r = 0;
		c+= 80; 
		count++;
		odd = !odd;
	}
		

	}
}

	

