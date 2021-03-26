/**
 * This is an interface class that changes the location if the animal flies.
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - Flyable Interface 
 * 3/22/2021
 * Spring 2021
 */
public interface Flyable {
	/**
	 * Abstract method that takes a new location as parameter
	 * @param l the new location to fly to
	 */
	public void fly(Location l);
}//end class
