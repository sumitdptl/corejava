package customexceptions;

public class PasswordTooShortException extends Exception {
	private String msg;
	
	public PasswordTooShortException()
	{
		this.msg = "Password can not be lesser than 6 characters";
	}
	
	public String toString()
	{
		return "PasswordTooShortException : "+msg;
	}
	
	public String getMessage()
	{
		return msg;
	}	
}
