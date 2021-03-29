package rechner;

public class OverflowException extends Exception {

	public OverflowException(String message) {
		super(message);
	}
	
	OverflowException(){
		super();
	}
}
