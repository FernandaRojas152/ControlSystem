package model;

/**
 * @version Feb 20th 2020
 * @author Fernanda Rojas
 * Class Turn
 */
public class Turn {
	//Attributes
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
	 * 
	 * @param letter
	 */
	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isStatus() {
		return status;
	}
	
	/**
	 * 
	 * @param status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	/**
	 * 
	 * @return
	 */
	public Turn getLast() {
		return last;
	}
	
	/**
	 * 
	 * @param last
	 */
	public void setLast(Turn last) {
		this.last = last;
	}
	
	@Override
	public String toString() {
	
		return letter;
	}
}
