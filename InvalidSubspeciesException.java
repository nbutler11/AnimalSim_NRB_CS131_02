/**
 * This class is an exception class for invalid subspecies. 
 * @author Nathan Butler
 * @version 1.0
 * Programming Project 3 - InvalidSubspeciesException Class
 * 3/22/2021
 * Spring 2021
 */
public class InvalidSubspeciesException extends RuntimeException{
	/**
	 * Constructor that takes a message to tell the user what is wrong.
	 * @param message - tells the user what is wrong
	 */
	InvalidSubspeciesException(String message){
		super(message);
	}///end constructor
}//end class
