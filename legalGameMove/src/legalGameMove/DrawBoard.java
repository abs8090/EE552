package legalGameMove;

import java.awt.*;

import javax.swing.*;

public class DrawBoard extends JPanel{

	int r = 0, c = 0;
	int w = getWidth(), h = getHeight();
	
	@Override
	public void paint(Graphics g){
		
		int count = 0;
		while(count <= 10){
				
			if((count % 2) == 0){
				
			for(int i = 0; i <= 800; i++){				
				for(int j = 0; j <= 800; j++){
				
					g.setColor(Color.black);
					g.fillRect(r , c, 80, 80);

					r+= 80;
						g.setColor(Color.white);
						g.fillRect(r, c, 80, 80);
					r+= 80;					
				}
			}
			
		}else{
			
			for(int i = 0; i <= 800; i++){				
				for(int j = 0; j <= 800; j++){
				
					g.setColor(Color.white);
					g.fillRect(r , c, 80, 80);

					r+= 80;
						g.setColor(Color.black);
						g.fillRect(r, c , 80, 80);
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

	

