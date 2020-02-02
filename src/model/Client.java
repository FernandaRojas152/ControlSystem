package model;

/**
 * @version Feb 2th 2020
 * @author Fernanda Rojas
 * Class Client
 */
public class Client {
	private String docType;
	private String id;
	private String name;
	private String lastName;
	private String phone;
	private String direction;
	
	//Constructor method
	public Client(String docType, String id, String name, String lastName, String phone, String direction) {
		this.docType = docType;
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.direction = direction;
	}
	
	//getters and setters for Client's attributes
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
}
