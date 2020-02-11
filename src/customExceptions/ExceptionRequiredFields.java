package customExceptions;

/**
 * @version Feb 11th 2020
 * @author Fernanda
 *
 */
public class ExceptionRequiredFields extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionRequiredFields(){
		super("Required Fields \n You must type all the following fields: document type,"
				+ "document number, name and last name");		
	}
}