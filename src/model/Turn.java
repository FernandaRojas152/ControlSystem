package model;

/**
 * @version
 * @author Fernanda Rojas
 *
 */
public class Turn {
	
	private char letter;
	private int number;
	private boolean status;
	
	public Turn(char letter, int number, boolean status) {
		this.letter = letter;
		this.number = number;
		this.status = status;
	}
	
	public char getLetter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	/**
	 * 
	 * @return
	 */
	public char[] alphabet() {
		char [] alphabet= new char[26];
		
		for (int i=0, j=65; i<alphabet.length; i++, j++) {
			
			alphabet[i]= (char) j;
		}
		return alphabet;
	}
	
	private int generate(int number) {
		
	}

}
