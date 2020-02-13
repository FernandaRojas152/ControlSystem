package model;

import java.util.ArrayList;
import customExceptions.*;

/**
 * @version Feb 2th 2020
 * @author Fernanda Rojas
 * Class Employee
 */
public class Employee {

	// Attributes
	private boolean attended= false;
	
	/**
	 * ArrayList of clients that are going to be added.
	 */
	private ArrayList<Client> clients;
	
	/**
	 * Association with class Turn so it can assign a turn for each client.
	 */
	private Turn last;

	// Methods

	/**
	 * Constructor's method of Class Employee
	 */
	public Employee() {
		clients = new ArrayList<>();
	}

	// getters and setters of Employee's attributes
	/**
	 * get the clients that are in the program.
	 * @return clients - an arrayList of clients.
	 */
	public ArrayList<Client> getClients() {
		return clients;
	}
	
	/**
	 * Modifies the arrayList of clients to change one or
	 * all clients
	 * @param clients -the new client or clients that are going to be
	 * changed
	 */
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	/**
	 * This method will search a client by his id, and show it on screen.
	 * <b> pre: </b> id!= null <br>
	 * <b> post: shows the specific client with his id. </b>
	 * @param id -client's document number.
	 * @return client -an specific client that has been saved in a new object.
	 */
	public Client searchClient(String id) throws NullPointerException{
		boolean find= false;
		Client client= null;

		for(int i=0; i<clients.size() && !find; i++) {
			if(clients.get(i).getId().equals(id)) {
				client= clients.get(i);
				find=true;
			}else {
				//throw new NullPointerException
			}
		}
		return client;
	}
	
	/**
	 *This method will add a new Client, but only with 4 params that are required 
	 * <b> post: it's added a new client on the arrayList in a
	 * specific position. </b>
	 * @param docType -client's document type
	 * @param id -client's document number.
	 * @param name -client's name
	 * @param lastName -client's last name.
	 * @return clients -an added new client to the arrayList.
	 * @throws ExceptionRequiredFields -it's thrown when all four params are null.
	 */
	public ArrayList<Client> addClient(String docType, String id, String name, String lastName) throws ExceptionRequiredFields{
				
		clients.add(new Client(id, docType, name, lastName));

		return clients;
	}
	
	/**
	 * Overloading addClient method, this one will have all of the 6 attributes of
	 * Client's class, this one it's just in case if a client wish to
	 * fill all the fields.
	 * <b> post: it's added a new client on the arrayList. </b>
	 * @param docType -client's document type.
	 * @param id -client's document number.
	 * @param name -client's document name.
	 * @param lastName -client's document last name.
	 * @param phone -client's document phone.
	 * @param direction -client's document direction.
	 * @return clients -an added new client to the arrayList.
	 * @throws ExceptionRequiredFields -it's thrown when all four params are null.
	 */
	public ArrayList<Client> addClient( String docType, String id, String name, String lastName, String phone, String direction) throws ExceptionRequiredFields{
				clients.add(new Client(id, docType, name, lastName, phone, direction));
		return clients;
	}

	/**
	 * This method will advance the turn starting by 'AOO' 'till 'Z99'
	 * and after it reaches 'Z99' returns to 'A00'.
	 * <b> post: creates a new turn that it's going to be </b>
	 * assigned to a client.
	 * @return last -an object of type Turn that represents the actual turn.
	 */
	public Turn advanceTurn() {
		if (last == null) {
			last = new Turn("A00");
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
	
	/**
	 * This method will tell if a client was actually attended or not.
	 * The client can lose a turn if he's not there at the moment of the call.
	 * @return attended
	 */
	public boolean wasAttended() {
		if (last.isStatus()== true) {
			attended= true;
		}else {
			// throw new ExceptionNotAttended 
		}
		return attended;
	}
	
	/**
	public static void main(String[] args) {
		Employee e= new Employee();
		System.out.println(e.advanceTurn());
		System.out.println(e.advanceTurn());
		System.out.println(e.advanceTurn());
		System.out.println(e.advanceTurn());
	}
	*/
}
