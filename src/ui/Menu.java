package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Employee;

/**
 * @version Feb 14th 2020
 * @author Fernanda
 * Class Menu
 */
public class Menu {
	//attributes
	/** Constant*/
	public static final int EXIT= 6;
	
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
                System.out.println("1. Sort an especific topic \n 2. Sort Owners \n 3. Sort Clubs"+
            "4. Sort Binary \n 5. Exit");
                System.out.println("Please choose the option you want to use:");
                int option = entry.nextInt();
                if (option > 0 && option<= 4 ){
                    options.add(option);
                    break;
                } else if(option==5){
                	ShowExit();
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
	
	
	
}
