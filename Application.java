/**
 * This class is the application class that implements all classes and exceptions of the program. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - Application Class
 * 3/22/2021
 * Spring 2021
 */
import java.util.Arrays;
public class Application {
	public static void main(String[] args) {
		InvalidCoordinateException coordProb = new InvalidCoordinateException("Both coordinates cannot be less than O");
		InvalidSimIDException simProb = new InvalidSimIDException("Invalid ID Number");
		InvalidWingspanException wingProb = new InvalidWingspanException("Wingspan must be between 5.0 and 11.0");
		InvalidSubspeciesException specProb = new InvalidSubspeciesException("Subspecies must be one of the"
				+ " following Alaskan, Asiatic, European, Grizzly, Kodiak, Siberian");
		
		/* **********************************************************************
		 * 						Location Tests
		 * **********************************************************************
		 */
		//Start of Location
		for(int i = 0; i<50; i++)
			System.out.print("*");
		System.out.println("\n\t\tLocation Tests");
		try {
			Location local = new Location(2,4);
			Location lock = new Location();
			local.update(4, -2);
			local.getCoordinates();
			lock.update(5, 1);
			lock.getCoordinates();
			if(lock.getCoordinates()[0]<0 || lock.getCoordinates()[1]<0) throw coordProb;
			System.out.println("(" + lock.getCoordinates()[0] + "," + lock.getCoordinates()[1] + ")");
			if(local.getCoordinates()[0]<0 || local.getCoordinates()[1]<0) throw coordProb;
			System.out.println("(" + local.getCoordinates()[0] + "," + local.getCoordinates()[1] + ")");
			
		}
		catch(InvalidCoordinateException c) {
			System.out.println(c.getMessage());
		}
		
		for(int i = 0; i<50; i++)
			System.out.print("*");
		System.out.println("\n");
		
		/* **********************************************************************
		 * 						Animal Tests
		 * **********************************************************************
		 */
		//Start of Animal
		for(int i = 0; i<50; i++)
			System.out.print("*");
		System.out.println("\n\t\tAnimal Tests");
		//Animal ani1 = new Animal(); //will result in an error if not comment
		for(int i = 0; i<50; i++)
			System.out.print("*");
		System.out.println("\n");
		
		
		/* **********************************************************************
		 * 						Goldfinch Tests
		 * **********************************************************************
		 */
		//Start of Goldfinch 
		for(int i = 0; i<50; i++)
			System.out.print("*");
		System.out.println("\n\t\tGoldfinch Tests");
		try {
			Location goldLocation = new Location(32,11);
			Location gfLoc = new Location(24,19);
			Goldfinch gf1 = new Goldfinch();
			Goldfinch gold1 = new Goldfinch(3, goldLocation, 6.0);
			gf1.setSimID(4);
			gf1.setWingSpan(4.0);
			gf1.setLocation(gfLoc);
			gf1.eat();
			gf1.sleep();
			gf1.getCoordinates();
			
			gold1.eat();
			gold1.sleep();
			gold1.getCoordinates();
			gf1.walk(0);
			gf1.getCoordinates();
			Location goldFly = new Location(4,6);
			gold1.fly(goldFly);
			gold1.getCoordinates();
			
			if(gold1.getWingSpan()<5.0 || gold1.getWingSpan()>11.0) throw wingProb;
			if(gold1.getSimID()<0 || gold1.getSimID()==gf1.getSimID()) throw simProb;
			if(gold1.getLocation().getCoordinates()[0]<0 || gold1.getLocation().getCoordinates()[1]<0) throw coordProb;
			System.out.println("Goldfinch - ID:"+gold1.getSimID()+", Location: (" + gold1.getLocation().getCoordinates()[0] + "," 
					+ gold1.getLocation().getCoordinates()[1] + ")" + ", Wingspan:" + gold1.getWingSpan()+ ", Full:" + gold1.isFull() 
					+ ", Rested:" + gold1.isRested());
			
			if(gf1.getLocation().getCoordinates()[0]<0 || gf1.getLocation().getCoordinates()[1]<0) throw coordProb;
			if(gf1.getSimID()<0) throw simProb;
			if(gf1.getWingSpan()<5.0 || gf1.getWingSpan()>11.0) throw wingProb;
			System.out.println("Goldfinch - ID:"+gf1.getSimID()+", Location: (" + gf1.getLocation().getCoordinates()[0] + "," 
					+ gf1.getLocation().getCoordinates()[1] + ")" + ", Wingspan:" + gf1.getWingSpan()+ ", Full:" + gf1.isFull() 
					+ ", Rested:" + gf1.isRested());
		}
		catch(InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidWingspanException w) {
			System.out.println(w.getMessage());
		}
		catch(InvalidCoordinateException c) {
			System.out.println(c.getMessage());
		}
		
		for(int i = 0; i<50; i++)
			System.out.print("*");
		
		
		/* **********************************************************************
		 * 						Brown Bear Tests
		 * **********************************************************************
		 */
		//start of Brown Bear
		System.out.println("\n");
		for(int i = 0; i<50; i++)
			System.out.print("*");
		System.out.println("\n\t\tBrownBear Tests");
		try {
			String[] SubSpec = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
			Location bearLoc = new Location(2,32);
			Location b1Loc = new Location(22,8);
			BrownBear bear1 = new BrownBear();
			BrownBear brown1 = new BrownBear(45, b1Loc, "Asiatic");
			bear1.setSimID(32);
			bear1.setLocation(bearLoc);
			bear1.setSubSpecies("Polar");
			bear1.setFull(true);
			bear1.setRested(false);
			bear1.walk(2);
			
			brown1.eat();
			brown1.sleep();
			brown1.swim(3);
			if(brown1.getSimID()<0) throw simProb;
			if(brown1.getCoordinates()[0]<0 || brown1.getCoordinates()[1]<0) throw coordProb;
			if(!Arrays.asList(SubSpec).contains(brown1.getSubSpecies())) throw specProb;//looked up on Internet how to do this
			System.out.println("BrownBear - ID:"+brown1.getSimID()+", Location: (" + brown1.getLocation().getCoordinates()[0] + "," 
					+ brown1.getLocation().getCoordinates()[1] + ")" +  ", Sub species: " + brown1.getSubSpecies()+
					", Full:" + brown1.isFull() + ", Rested:" + brown1.isRested());
						
			if(bear1.getSimID()<0) throw simProb;
			if(bear1.getCoordinates()[0]<0 || bear1.getCoordinates()[1]<0) throw coordProb;
			if(!Arrays.asList(SubSpec).contains(bear1.getSubSpecies())) throw specProb;
			System.out.println("BrownBear - ID:"+bear1.getSimID()+", Location: (" + bear1.getLocation().getCoordinates()[0] + "," 
					+ bear1.getLocation().getCoordinates()[1] + ")" + ", Sub species: " + bear1.getSubSpecies()+", Full:" 
					+ bear1.isFull() + ", Rested:" + bear1.isRested());

		}
		catch(InvalidSubspeciesException s) {
			System.out.println(s.getMessage());
		}
		catch(InvalidSimIDException id) {
			System.out.println(id.getMessage());
		}
		catch(InvalidCoordinateException ce) {
			System.out.println(ce.getMessage());
		}
		for(int i = 0; i<50; i++)
			System.out.print("*");
		
	}//end main

}//end class
