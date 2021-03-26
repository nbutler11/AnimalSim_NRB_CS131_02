/**
 * This class is an exception class for invalid coordinates entered in the program. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - InvalidCoordinateException Class
 * 3/22/2021
 * Spring 2021
 */
public class InvalidCoordinateException extends Exception{
	/**
	 * Constructor takes a message and tells the user what is wrong. 
	 * @param message - the message to the user telling them the error
	 */
	InvalidCoordinateException(String message){
		super(message);
	}//end constructor
}//end class
