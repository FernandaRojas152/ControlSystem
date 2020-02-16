package ui;

import customExceptions.ExceptionNotAttended;
import customExceptions.ExceptionRequiredFields;

/**
 * @version Feb 14th 2020
 * @author Fernanda
 *
 */
public class Main {

	public static void main(String[] args) throws ExceptionRequiredFields, ExceptionNotAttended {
		//association with class menu
		Menu menu= new Menu();
		/** Loads the menu so it can be shown on screen and manipulated.*/
		menu.LoadMenu();
	}

}
