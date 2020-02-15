import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import customExceptions.ExceptionAlreadyExists;
import customExceptions.ExceptionRequiredFields;
import model.Employee;
/**
 * @version Feb 14th 2020
 * @author Fernanda
 * Class Employee
 */
class TestEmployee {
	private Employee employee;
	
	public void setupStage1() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		employee.addClient("CC", "3186170", "Amanda", "Rojas", "4388786", "Cra 12 E #50-45");
	}
	
	@Test
	void testUserDoesntExist() throws ExceptionRequiredFields {
		//setupStage1();
		Assertions.assertThrows(NullPointerException.class, () -> employee.searchClient("31577298"), "Should throw an exception");
	}
	
	@Test
	void testUserExist() throws ExceptionRequiredFields {
		setupStage1();
		
		
	}
	/**
	@Test
	void testNotUserRegistered() throws ExceptionRequiredFields {
		setupStage1();
		
=======
/**
*@version Feb 14th 2020
*@author Fernanda Rojas
*Class TestEmployee
*/

class TestEmployee {
	private Employee employee;
	public void setupStage1() {
>>>>>>> 8034095157e779a29e703dfe4e04f8d1816dd946
	}
	
	//test Search Client
	@Test
	void testThereAreClients() throws ExceptionRequiredFields {
		setupStage1();
		
	}
	*/
	
	//test Assign turn
	
	
	//Consult turns
	
	
	
	//Attends turn

}
