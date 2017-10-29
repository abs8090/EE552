package solar_system;
import java.io.*;
import java.util.*;
public class SolarSystem {
	
	public String name;
	public double mass, diameter, gravity;
	
	
	
	public static void main(String[] args) {
		ArrayList<SolarSystem> planets = new ArrayList<>();
		
		try {
			FileReader fr=new FileReader("input.txt");
			
			Scanner scanner = new Scanner(fr);

			String nextLine = scanner.nextLine();
			String regex = "(\\s)+";

			String[] header = nextLine.split(regex);

			for(int i = 0; i < header.length; i++){
				 				 				
				 if(header[i].equals("MERCURY") || header[i].equals("EARTH") || header[i].equals("MOON")){
					 
						 fr=new FileReader("input.txt");
						
						 scanner = new Scanner(fr);
						
					 SolarSystem ss = new SolarSystem();
					 ss.name = header[i];
					 
					 while (scanner.hasNext()) {
				
						 String[] row = scanner.nextLine().split(regex);
						 
						 if(row[0].equals("Mass(1024kg)")){
							 
							 if(row[i].contains(",")){
								 row[i] = row[i].replace(",", "");
							 }
							 
							 ss.mass = Double.valueOf(row[i]);
							 
						 }else if(row[0].equals("Diameter(km)")){
							
							 if(row[i].contains(",")){
								 row[i] = row[i].replace(",", "");
							 }
							 
							 ss.diameter = Double.valueOf(row[i]);
							 
						 }else if(row[0].equals("Gravity(m/s2)")){
							 
							 if(row[i].contains(",")){
								 row[i] = row[i].replace(",", "");
							 }
							 ss.gravity = Double.valueOf(row[i]);
						 }										
					 }
					 planets.add(ss);
				 }
			}
			
  
			for(int x = 0; x < planets.size(); x++){
				
				System.out.println(planets.get(x).name);
				System.out.println(planets.get(x).mass);
				System.out.println(planets.get(x).diameter);
				System.out.println(planets.get(x).gravity);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
