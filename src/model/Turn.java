package model;

/**
 * @version Feb 20th 2020
 * @author Fernanda Rojas
 * Class Turn
 */
public class Turn {
	//Attributes
	/**Letter at the start of this turn*/
	private String letter;
	private boolean status;
	
	/**
	 * An object of class Turn that it's going to save the turn.
	 */
	private Turn last;
	
	//Methods
	/**
	 * Constructor's method of class Turn
	 * @param letter -the letter that it's going to be the number of the turn.
	 */
	public Turn(String letter) {
		this.letter= letter;
		status= false;
		last= null;
	}
	
	//getters and setters
	/**
	 * Gets the letter of the turn
	 * @return letter -a String that represents the letter
	 */
	public String getLetter() {
		return letter;
	}
	
	/**
	 * Modifies the letter to the new one.
	 * @param letter -the new letter.
	 */
	public void setLetter(String letter) {
		this.letter= letter;
	}
	
	/**
	 * Shows if a turn it's active or not.
	 * @return status -a boolean that indicates if a client has a turn.
	 */
	public boolean isStatus() {
		return status;
	}
	
	/**
	 * Modifies the status that a turn has.
	 * @param status -the actual status of the turn.
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	/**
	 * Gets the new turn when it's changing of number.
	 * @return last -an oject of type Turn that saves the new turn.
	 */
	public Turn getLast() {
		return last;
	}
	
	/**
	 * Modifies the last turn that has been saved.
	 * @param last -the new turn.
	 */
	public void setLast(Turn last) {
		this.last= last;
	}
	
	@Override
	public String toString() {
	
		return letter;
	}
}
