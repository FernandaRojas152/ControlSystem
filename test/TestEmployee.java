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
		employee= new Employee();
		employee.addClient("CC", "3186170", "Amanda", "Rojas", "4388786", "Cra 12 E #50-45");
	}
	
	public void setupStage2() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		employee= new Employee();
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
	}
	
	@Test
	void testNotUsersThere() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		setupStage2();
		assertTrue(employee.getClients().isEmpty());
	}
	
	@Test
	void testUsersThere() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		setupStage1();
		assertTrue(employee.getClients().size()!=0);
	}
	
	
	@Test
	void testsearchClient() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		setupStage1();
		assertNotNull(employee.searchClient("3186170"));
	}
	
	@Test /** This one it's when a client doesn't exist*/
	void testsearch() throws ExceptionRequiredFields, ExceptionAlreadyExists {
		setupStage1();
		
		assertNull(employee.searchClient("1005706215"));
		//Assertions.assertThrows(NullPointerException.class, () -> employee.searchClient("1005706215"), "Should throw an exception");
	}
	
	
	
	
}