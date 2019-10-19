package exeption;
import java.lang.Exception;

public class DivideException extends ArithmeticException  {
	
	public DivideException()
    {
        super();
    }
	public DivideException(String message)
    {
        super (message);
    }


}
