package model;

/**
 * @version Feb 2th 2020
 * @author Fernanda Rojas
 * Class Client
 */
public class Client {
	//Atributes
	private String docType;
	private String id;
	private String name;
	private String lastName;
	private String phone;
	private String direction;
	
	/**
	 * Association with class Turn so each client has a turn.
	 */
	private Turn turn;
	
	//Methods
	/**
	 * Constructor's method of class Client
	 * @param docType -client's document type.
	 * @param id -client's document number.
	 * @param name -client's document name.
	 * @param lastName -client's document lastName.
	 */
	public Client(String docType, String id, String name, String lastName) {
		this.docType = docType;
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	/**
	 * Overloading constructor Client
	 * @param docType -client's document type.
	 * @param id -client's document number.
	 * @param name -client's document name.
	 * @param lastName -client's document lastName.
	 * @param phone -client's document phone.
	 * @param direction -client's document direction.
	 */
	public Client(String docType, String id, String name, String lastName, String phone, String direction) {
		this.docType = docType;
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.phone= phone;
		this.direction= direction;
	}
	
	//getters and setters for Client's attributes
	/**
	 * Gets the document type of the client
	 * @return docType -an String that represent the document type
	 */
	public String getDocType() {
		return docType;
	}
	
	/**
	 * Modifies the document type of the client
	 * @param docType -the type that it's going to be modificated
	 */
	public void setDocType(String docType) {
		this.docType = docType;
	}
	
	/**
	 * Gets the document number of the client
	 * @return id- a String that represents the id.
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Modifies the document number of the client
	 * @param id -the id that it's going to be changed.
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Gets the name of the client.
	 * @return name -a String that represents the name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Modifies the name of the client.
	 * @param name- the name that the person has.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the last name of the client
	 * @return lastName -a String that represents the last name.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Modifies the last name of the client.
	 * @param lastName -the last name that it's going to change.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the phone number of the client
	 * @return phone -a String that represents the phone number.
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * Modifies the phone number of the client
	 * @param phone -the phone that the client has.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * Gets the address of the client
	 * @return direction -a String that represents the address
	 */
	public String getDirection() {
		return direction;
	}
	
	/**
	 * Modifies the address of the client
	 * @param direction -the address that the client has input.
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	/**
	 * gets the turn that has been assigned to the client
	 * @return turn -an object of type Turn that it's the turn that
	 * the client has in order to be attended.
	 */
	public Turn getTurn() {
		return turn;
	}
}
