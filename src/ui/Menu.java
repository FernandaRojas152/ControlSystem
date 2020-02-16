package ui;

import java.util.ArrayList;
import java.util.Scanner;

import customExceptions.ExceptionAlreadyExists;
import customExceptions.ExceptionRequiredFields;
import model.Employee;

/**
 * @version Feb 14th 2020
 * @author Fernanda
 * Class Menu
 */
public class Menu {
	//attributes
	public boolean end= false;
	//association
	private Employee employee;
	
	
	Scanner entry= new Scanner(System.in);
	
	public void LoadMenu() {
		Welcome();
		ShowMenu();
	}
	
	public void Welcome() {
		System.out.println("  ------------------------------------------------------ ");
		System.out.println("            Hi, welcome!  ");
		System.out.println("  ------------------------------------------------------ ");
	}
	
	public ArrayList<Integer> ShowMenu(){
		ArrayList<Integer> options = new ArrayList<>();
        while (true && end!=true){
            try{
                System.out.println(" 1. Add Client\n 2. Assign Turn\n 3. Advance turn"+
            "\n 4. Search Client \n 5. Attend Client \n 6. Exit");
                System.out.println("Please choose the option you want to use:");
                int option = entry.nextInt();
                if (option > 0 && option<= 5 ){
                    options.add(option);
                    break;
                } else if(option==6){
                	ShowExit();
                	end= true;
                } else {
                    Error();
                }
            } catch (Exception e){
                Error();
                entry.next();
            }
        }
        return options;
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
			employee.addClient(dt, dn, name, last, ph, add);
		} catch (ExceptionRequiredFields e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExceptionAlreadyExists e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void assignTurn() {
		
	}
	
	
	public void advanceTurn() {
		employee.advanceTurn();
	}
	
	public void searchClient() {
		System.out.println("Please input the document number of the client:");
		String id= entry.nextLine();
		employee.searchClient(id);
	}
	
	public void attendClient() {
		
	}
	
}
