import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Employee;
import model.Turn;
class TestTurn {
	private Turn turn;
	private Employee e;
	void setupStage1(){
		turn= new Turn("C99");
		e= new Employee();
	}
	
	void setupStage2(){
		turn= new Turn(null);
		e= new Employee();
	}
	
	@Test
	void testGetNextTurn() {
		setupStage1();
		e.setLast(turn);
		
		assertEquals(e.getLast(),e.advanceTurn(),"Should be D00");
	}
	
	@Test
	void testGetTurn() {
		setupStage1();
		
		assertEquals("C99",turn.getLetter(),"Should be C99");
	}
	
	@Test
	void testNewTurn() {
		setupStage2();
		e.setLast(null);
		e.advanceTurn();
		assertEquals(e.getLast(),e.advanceTurn(),"Should be A00");
	}
	
	@Test
	void testStatus() {
		setupStage2();
		assertFalse(turn.isStatus(), "Should be false");
	}
	
	@Test
	void testStatus2() {
		setupStage1();
		e.setLast(turn);
		turn.setStatus(true);
		assertTrue(turn.isStatus());
	}
}
