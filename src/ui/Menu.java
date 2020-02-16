package ui;

import java.util.ArrayList;
import java.util.Scanner;

import customExceptions.ExceptionAlreadyExists;
import customExceptions.ExceptionNotAttended;
import customExceptions.ExceptionRequiredFields;
import model.Employee;

/**
 * @version Feb 14th 2020
 * @author Fernanda
 * Class Menu
 */
public class Menu {
	//attributes
	public static final int EXIT=6;
	//association
	private Employee employee;


	Scanner entry= new Scanner(System.in);

	public void LoadMenu() throws ExceptionRequiredFields, ExceptionNotAttended {
		 manageMenu();
	}

	public void Welcome() {
		System.out.println("  ------------------------------------------------------ ");
		System.out.println("            Hi, welcome!  ");
		System.out.println("  ------------------------------------------------------ ");
	}

	public void showMenu(){
		System.out.println(" 1. Add Client\n 2. Assign Turn\n 3. Advance turn"+
				"\n 4. Search Client \n 5. Attend Client \n 6. Exit");
	}

	public void manageMenu() throws ExceptionRequiredFields, ExceptionNotAttended{
		int option;
		Welcome();
		do{
			
			showMenu();
			System.out.println("Please choose the option you want to use:");
			option = entry.nextInt();
			entry.nextLine();
			doOperation(option);

		}while(option != EXIT);
	}

	public void doOperation(int option) throws ExceptionRequiredFields, ExceptionNotAttended{

		switch(option){

			case 1:
				addClient();
			break;

			case 2:
				assignTurn();
			break;

			case 3:
				advanceTurn();
			break;

			case 4:
				searchClient();
			break;

			case 5:
				attendClient();
			break;
			
			case 6:
					ShowExit();
			break;


			default: Error();

		}
	}
	public void ShowExit() {
		System.out.println(" ");
		System.out.println("Thank you for using this application, come back soon :).");
		System.out.println(" ");
	}

	public void Error(){	
		System.out.println(" ");
		System.out.println(" ******************************************************************************************* ");
		System.out.println(" * Sorry, there's not an option available yet. Please try again with the possible options. * ");
		System.out.println(" ******************************************************************************************* ");
		System.out.println(" ");
	}

	public void addClient() throws ExceptionRequiredFields {
		System.out.println("Input your document type:");
		String dt= entry.nextLine();
		System.out.println("Input your document number:");
		String dn= entry.nextLine();
		System.out.println("Input your name:");
		String name= entry.nextLine();
		System.out.println("Input your last name:");
		String last= entry.nextLine();
		System.out.println("Input your phone:");
		String ph= entry.nextLine();
		System.out.println("Input your address:");
		String add= entry.nextLine();

		try {
			if(dt!= null && dn!= null && name!= null && last!=null || ph!=null || add!=null) {
				employee.addClient(dt, dn, name, last, ph, add);
			} else {
				employee.addClient(dt, dn, name, last);
			}
		} catch (ExceptionRequiredFields e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (ExceptionAlreadyExists e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}


	public void assignTurn() {
		System.out.println("Please input the document number of the client:");
		String id= entry.nextLine();
		employee.assignTurn(id);
	}


	public void advanceTurn() {
		employee.advanceTurn();
	}

	public void searchClient() {
		System.out.println("Please input the document number of the client:");
		String id= entry.nextLine();
		if(employee.searchClient(id)!=null) {
			String n= employee.searchClient(id).getName();
			String lt= employee.searchClient(id).getLastName();
			String d= employee.searchClient(id).getDocType();
			String i= employee.searchClient(id).getId();
			System.out.println(n+lt+d+i);
		}else {
			throw new NullPointerException();
		}
	}

	public void attendClient() throws ExceptionNotAttended {
		boolean end2= false;
		while(!end2) {
			System.out.println("  ------------------------------------------------------ ");
			System.out.println("                 Was the client attended? :)  ");
			System.out.println("  ------------------------------------------------------ ");
			
			System.out.println("Please input the document number of the client:");
			String id= entry.nextLine();
			
			System.out.println("1. Yes \n 2. No");
			int o= entry.nextInt();
			if(o==1) {
				employee.searchClient(id).getTurn().setStatus(true);
			}else if(o==2) {
				throw new ExceptionNotAttended();
			}else {
				System.out.println(" * Sorry, there's not an option available yet. Please try again with the possible options. * ");
			}
		}
	}

}
