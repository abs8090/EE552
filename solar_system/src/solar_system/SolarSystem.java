package solar_system;
import java.io.*;
import java.util.*;
public class SolarSystem {

	public static void main(String[] args) {
		
		try {
	          FileReader fr=new FileReader("input.txt");    
	          
	          
	          Scanner s = new Scanner(fr);
	          int counter = 0;
				
	          while (s.hasNext()) {
					
					if(s.hasNext() != false){
						// use stringBuffer to read each line, then separate each line by space and upto index 5
						//and save it in an array.
						// then, save that info in an object
							System.out.println(s.nextLine()+ "\t");
						
					}
				}
				
//				while (s.hasNextLine()) {
//
//					if(s.hasNextLine() != false){
//						System.out.println(s.nextLine()+ "\t");
//					}
//				}
				
	          fr.close();  
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
