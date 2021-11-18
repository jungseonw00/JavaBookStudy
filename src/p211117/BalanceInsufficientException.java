package p211117;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}