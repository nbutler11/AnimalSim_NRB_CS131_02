/**
 * This class encapsulates a point on a simulation map. The methods in this class put the location into an array.
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - Location Class
 * 3/22/2021
 * Spring 2021
 */
public class Location {
	private int xCoord;
	private int yCoord;

	/**
	 * Empty constructor that initializes the variables
	 */
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}//end constructor
	
	/**
	 * Constructor that passes two values and sets them to coordinates
	 * @param x xCoordinate
	 * @param y yCoordinate
	 */
	public Location(int x, int y) {
		xCoord = x;
		yCoord = y;
		getCoordinates();
	}//end constructor
	
	/**
	 * Updates the coordinates for the location
	 * @param x xCoordinate
	 * @param y yCoordinate
	 */
	public void update(int x, int y) {
		xCoord = x;
		yCoord = y;
		getCoordinates();
	}//end update
	
	/**
	 * Puts the coordinates into an array
	 * @return coordinate array
	 */
	public int[] getCoordinates(){
		int[] Coordinates = {xCoord, yCoord};
		return Coordinates;
	}//end getCoordinates
	
}//end class
