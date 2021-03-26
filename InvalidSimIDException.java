/**
 * This class is an exception class for invalid sim id. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - InvalidSimIDException Class
 * 3/22/2021
 * Spring 2021
 */
public class InvalidSimIDException extends RuntimeException{
	/**
	 * Constructor that takes a message to tell the user what is wrong.
	 * @param message - tells the user what is wrong
	 */
	InvalidSimIDException(String message){
		super(message);
	}//end constructor
}//end class
