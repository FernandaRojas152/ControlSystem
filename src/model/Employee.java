package model;

import java.util.ArrayList;

/**
 * @version Feb 2th 2020
 * @author Fernanda Rojas
 * Class Employee
 */
public class Employee {
	// Attributes
	private ArrayList<Client> clients;
	private Turn last;

	// Methods

	// Constructor's method
	public Employee() {
		clients = new ArrayList<>();
	}

	// getters and setters of Employee's attributes

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public ArrayList<Client> searchClient(String id) {
		return clients;
	}

	public ArrayList<Client> addClient(String id, String docType, String name, String lastName) {
		if(id== null && docType== null && name== null && lastName== null) {
			try {
				
			}catch(Exception e){
				
			}
			
		}

		return clients;
	}

	/**
	 * 
	 * @return turn
	 */
	public Turn advanceTurn() {
		if (last == null) {
			last = new Turn("Z98");
		} else {
			char c = last.getLetter().charAt(0);
			char b = last.getLetter().charAt(1);
			char a = last.getLetter().charAt(2);
			if (a != '9') {
				a++;
			} else {
				a = '0';
				if (b < 57) {
					b++;
				} else {
					b = 48;
					if (c < 90) {
						c++;
					} else {
						c = 'A';
					}
				}
			}
			String turnf = c + "" + b + "" + a;
			last.setLetter(turnf);
		}
		return last;
	}


}
