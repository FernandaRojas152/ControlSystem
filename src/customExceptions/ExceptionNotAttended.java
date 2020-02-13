package customExceptions;

public class ExceptionNotAttended extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionNotAttended() {
		super("The client wasn't attended due to he wasn't in the place when he was called");
	}
}
