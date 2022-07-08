package customexceptions;

public class PasswordTooLongException extends Exception {
	private String msg;
	
	public PasswordTooLongException()
	{
		this.msg = "Password can not be more than 12 characters";
	}
	
	public String toString()
	{
		return "PasswordTooLongException : "+msg;
	}
	
	public String getMessage()
	{
		return msg;
	}	
}
