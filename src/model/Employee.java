package model;
import java.util.ArrayList;

/**
 * @version Feb 2th 2020
 * @author Fernanda Rojas
 * Class Employee
 */
public class Employee {
	//Attributes
	private ArrayList<Client> clients;
	
	//Methods
	
	//Constructor's method
	public Employee() {
		clients= new ArrayList<>();
	}
	
	//getters and setters of Employee's attributes
	
	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	public ArrayList<Client> searchClient(String id){
		return clients;
	}
	
	public ArrayList<Client> addClient(String id, String docType, String name, String lastName){
		return clients;
	}
	
	public void advanceTurn() {
		
	}
	
	
	
	
}
