package customExceptions;

/**
 * @version Feb 14th 2020
 * @author Fernanda
 * Class ExceptionAlreadyExists
 */
public class ExceptionAlreadyExists extends Exception{
	public ExceptionAlreadyExists(String id) {
		super("The document "+ id + "It is already registered in the system");
	}
}
