import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import customExceptions.ExceptionAlreadyExists;
import customExceptions.ExceptionRequiredFields;
import model.Client;
import model.Employee;

/**
 * @version Feb 14th 2020
 * @author Fernanda
 * Class Employee
 */
class TestEmployee {
	private Employee employee;
	private Client client;
	
	/** Setting up stages*/
	public void setupStage1() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		employee.addClient("CC", "3186170", "Amanda", "Rojas", "4388786", "Cra 12 E #50-45");
	}
	
	/** Making the tests*/
	@Test
	void testUserDoesntExist() throws ExceptionRequiredFields {
		//setupStage1();
		Assertions.assertThrows(NullPointerException.class, () -> employee.searchClient("31577298"), "Should throw an exception");
	}
	
	@Test
	void testUserExist() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		setupStage1();
		try {
			employee.addClient("CC", "3186170", "Amanda", "Rojas", "4388786", "Cra 12 E #50-45");
			
		}catch(ExceptionAlreadyExists e) {
			assertTrue(true);
		}
		
		
		//Assertions.assertThrows(ExceptionAlreadyExists.class, () -> employee.searchClient("31577298"), "Should throw an exception");
		//employee.addClient("CC", "1005706215", "Fernanda", "Rojas");
	}
	
	@Test
	void NotUsersThere() {
		assertEquals(0,employee.getClients().size(),"Must be an empty arraylist");
	}
	
	@Test
	void UsersThere() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		setupStage1();
		assertTrue(employee.getClients().size()!=0);
	}
}