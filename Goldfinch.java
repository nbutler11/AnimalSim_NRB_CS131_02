/**
 * This class is child class of animal that is for a type of animal. Inherits the animal class and uses 
 * interfaces to run the animal simulation.
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - Goldfinch Class
 * 3/22/2021
 * Spring 2021
 */
public class Goldfinch extends Animal implements Flyable, Walkable{
	private double wingSpan;
	
	/**
	 * Constructor that initializes the variables
	 */
	public Goldfinch() {
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
		wingSpan = 9.0;
	}//end constructor
	
	/**
	 * Constructor that sets the variables to the parameters
	 * @param simID the simulation ID
	 * @param l the location of the animal
	 * @param ws the wingspan of the goldfinch
	 */
	public Goldfinch(int simID, Location l, double ws) {
		this.simID = simID;
		location = l;
		wingSpan = ws;
		full = false;
		rested = true;
	}//end constructor
	
	/**
	 * Moves the Goldfinch to a new location
	 * @param l the new location
	 */
	public void fly(Location l) {
		setLocation(l);
	}//end fly
	
	/**
	 * Moves the Goldfinch 1 unit in specified direction
	 * @param direction - direction Goldfinch moves
	 */
	public void walk(int direction) {
		int xCoordinate = location.getCoordinates()[0];
		int yCoordinate = location.getCoordinates()[1];
		getCoordinates();
		if(direction == 0) {
			xCoordinate = location.getCoordinates()[0] + 1;
		}
		else if(direction == 1) {
			yCoordinate = location.getCoordinates()[1] + 1;
		}
		else if(direction == 2) {
			xCoordinate = location.getCoordinates()[0] - 1;
		}
		else if(direction == 3) {
			yCoordinate = location.getCoordinates()[1] - 1;
		}
		location.update(xCoordinate, yCoordinate);
		getCoordinates();
	}//end walk

	/**
	 * Finds the wingspan of the Goldfinch
	 * @return the wingspan
	 */
	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	/**
	 * Sets the wingspan of the animal
	 * @param wingSpan - the wingspan 
	 */
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}//end setWingSpan
	
}//end Class
