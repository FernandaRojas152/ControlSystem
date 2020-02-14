package customExceptions;

public class ExceptionAlreadyExists extends Exception{
	public ExceptionAlreadyExists(String id) {
		super("The document "+ id + "It is already registered in the system");
	}
}
