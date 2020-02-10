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
	private Turn last;
	
	//Methods
	//Constructor's method
	public Turn(String letter) {
		this.letter= letter;
		status= false;
		last= null;
	}
	
	//getters and setters
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Turn getLast() {
		return last;
	}

	public void setLast(Turn last) {
		this.last = last;
	}

	//
	@Override
	public String toString() {
	
		return letter;
	}
}
