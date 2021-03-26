/**
 * This class is an abstract class that is the parent class for the types of animals. 
 * This class uses constructors and methods to give information about the animal simulation.
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - Animal Class
 * 3/22/2021 
 * Spring 2021
 */
public abstract class Animal extends Location{
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	/**
	 * Empty constructor that initializes all variables 
	 */
	public Animal() {
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
	}//end constructor
	
	/**
	 * Preferred constructor that passes in variables and
	 * @param simID the id simulation number
	 * @param l the location
	 */
	public Animal(int simID, Location l) {
		this.simID = simID;
		location = l;
		full = false;
		rested = true;
	}//end constructor
	
	/**
	 * Processes a random number and returns true or false for if the animal was fed enough
	 * @return true if fed enough, false if not fed enough
	 */
	public boolean eat() {
		double rand = Math.random();
		if(rand<=0.5)
			full = false;
		else
			full = true;
		return full;
	}//end eat
	
	/**
	 * Process a random number and returns true or false for if the animal is well rested
	 * @return true if over 0.5, false less or equal than 0.5
	 */
	public boolean sleep() {
		double random = Math.random();
		if(random<=0.5)
			rested = false;
		else
			rested = true;
		return rested;
	}//end sleep
	
	/**
	 * Finds the sim id number
	 * @return sim id number
	 */
	public int getSimID() {
		return simID;
	}//end getSimID
	
	/**
	 * Set simulation id number
	 * @param simID simulation id number
	 */
	public void setSimID(int simID) {
		this.simID = simID;
	}//end setSimID

	/**
	 * Find the location of the animal
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}//end getLocation

	/**
	 * Set the location of the animal
	 * @param location of the animal
	 */
	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation

	/**
	 * Finds out if the animal is fed enough
	 * @return true if fed enough, false if not
	 */
	public boolean isFull() {
		return full;
	}//end isFull

	/**
	 * Set if the animal is fed enough
	 * @param full true if fed enough, false if not
	 */
	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	/**
	 * Find if the animal is rested enough
	 * @return true if rested enough, false if not
	 */
	public boolean isRested() {
		return rested;
	}//end isRested

	/**
	 * Set if the animal is rested enough
	 * @param rested true if rested enough, false if not
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested
	
}//end class
