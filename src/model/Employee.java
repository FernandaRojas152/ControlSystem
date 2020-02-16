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
	 * get the turn.
	 * @return last -an object of type turn that it's going to save the String
	 */
	public Turn getLast() {
		return last;
	}

	/**
	 * Modifies the String of the actual turn
	 * @param last -the new turn.
	 */
	public void setLast(Turn last) {
		this.last = last;
	}

	

	/**
	 *This method will add a new Client, but only with 4 params that are required 
	 * <b> post: it's added a new client on the arrayList in a
	 * specific position. </b>
	 * @param docType -client's document type
	 * @param id -client's document number.
	 * @param name -client's name
	 * @param lastName -client's last name.
	 * @throws ExceptionRequiredFields -it's thrown when all four params are null.
	 * @throws ExceptionAlreadyExists -already exists this client.
	 */
	public void addClient(String docType, String id, String name, String lastName) throws ExceptionRequiredFields, ExceptionAlreadyExists{
		boolean x= false;
		for(int i=0; i<clients.size() && x==false; i++) {
			if(clients.get(i).getId().equals(id)) {
				x=true;
				throw new ExceptionAlreadyExists(id);

			}
				if(x== false) {
				if(docType!= null && id!= null && name!= null && lastName!=null) {
					Client c = new Client(id, docType, name, lastName);
					clients.add(c);
				}else {
					throw new ExceptionRequiredFields();
				}
			}
		}
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
		 * @throws ExceptionRequiredFields -it's thrown when all four params are null.
		 */
		public void addClient(String docType, String id, String name, String lastName, String phone, String direction) throws ExceptionRequiredFields, ExceptionAlreadyExists{
			boolean x= false;
			for(int i=0; i<clients.size() && x==false; i++) {
				if(clients.get(i).getId().equals(id)) {
					x=true;
					throw new ExceptionAlreadyExists(id);

				}
					if(x== false) {
					if(docType!= null && id!= null && name!= null && lastName!=null) {
						Client c = new Client(id, docType, name, lastName, phone, direction);
						clients.add(c);
					}else {
						throw new ExceptionRequiredFields();
					}
				}
			}
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
				if(clients.get(i).getId().equalsIgnoreCase(id)) {
					client= clients.get(i);
					find=true;
				}
			}
			return client;
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
		 * this method will assign the turn to the searched client.
		 * @param id -the id of the client that it's going to be assigned a turn
		 * @throws NullPointerException -if searchClient it's null, that id doesn't exist.
		 */
		public void assignTurn(String id) {
			if(searchClient(id).getTurn()== null) {
				advanceTurn();
				searchClient(id).setTurn(last);
				last.setStatus(true);
			}else if(searchClient(id)== null) {
				throw new NullPointerException();
			}	
		}
		
		/**
		 * This method will tell if a client was actually attended or not.
		 * The client can lose a turn if he's not there at the moment of the call.
		 * @return attended- a boolean that it's going to save if it's true that was attended or not
		 * @throws ExceptionNotAttended -
		 */
		public boolean wasAttended() throws ExceptionNotAttended{
			boolean attended = false;
			if (last.isStatus()== true) {
				attended= true;
			}else {
				throw new ExceptionNotAttended();
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
