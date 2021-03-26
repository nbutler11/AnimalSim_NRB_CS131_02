/**
 * This class is child class of animal that is for a type of animal. Inherits the animal class and uses 
 * interfaces to run the animal simulation.
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - BrownBear Class
 * 3/22/2021
 * Spring 2021
 */
public class BrownBear extends Animal implements Walkable, Swimmable{
	private String subSpecies;
	
	/**
	 * Constructor that initializes the variables
	 */
	public BrownBear() {
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
		subSpecies = "Alaskan";
	}//end constructor
	
	/**
	 * Constructor that passes parameters and sets those parameters to variables
	 * @param simID - simulation id
	 * @param l - location of animal
	 * @param subSpecies - sub species of bear
	 */
	public BrownBear(int simID, Location l, String subSpecies) {
		this.simID = simID;
		location = l;
		this.subSpecies = subSpecies;
		full = false;
		rested = true;
	}//end constructor
	
	/**
	 * Overrides the abstract interface method to move the animal in a direction
	 * @param direction - the direction the animal moves
	 */
	public void walk(int direction) {
		int xCoordinate = location.getCoordinates()[0];
		int yCoordinate = location.getCoordinates()[1];
		getCoordinates();
		if(direction == 0) {
			xCoordinate = location.getCoordinates()[0] + 3;
		}
		else if(direction == 1) {
			yCoordinate = location.getCoordinates()[1] + 3;
		}
		else if(direction == 2) {
			xCoordinate = location.getCoordinates()[0] - 3;
		}
		else if(direction == 3) {
			yCoordinate = location.getCoordinates()[1] - 3;
		}
		location.update(xCoordinate, yCoordinate);
		getCoordinates();
	}//end walk
	
	/**
	 * Moves the BrownBear two units in the specified direction
	 * @param direction - the direction it moves
	 */
	public void swim(int direction) {
		int xCoordinate = location.getCoordinates()[0];
		int yCoordinate = location.getCoordinates()[1];
		getCoordinates();
		if(direction == 0) {
			xCoordinate = location.getCoordinates()[0] + 2;
		}
		else if(direction == 1) {
			yCoordinate = location.getCoordinates()[1] + 2;
		}
		else if(direction == 2) {
			xCoordinate = location.getCoordinates()[0] - 2;
		}
		else if(direction == 3) {
			yCoordinate = location.getCoordinates()[1] - 2;
		}
		location.update(xCoordinate, yCoordinate);
		getCoordinates();
	}//end swim
	
	/**
	 * Finds the sub species
	 * @return the sub species
	 */
	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	/**
	 * Sets the sub species of the BrownBear
	 * @param subSpecies the subSpecies of the BrownBear
	 */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}//end setSubSpecies
	
}//end class
