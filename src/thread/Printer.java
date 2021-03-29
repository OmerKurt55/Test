package thread;
/**
 * 
 * @author Ömer Kurt
 *
 */
public class Printer implements Runnable {
	/**
	 * Was kann die? Mittels des Konstruktor wird ein Text definiert. Dieser Text
	wird einige Male auf die Standardausgabe ausgegeben, wenn die Methode print
	aufgerufen wird.
	 */
	private final CharSequence text;
	private static final int AMOUNT = 5;
	
	Printer(CharSequence text){
		this.text = text;
	}
	
	void print(int amount) {
		for(int i = 0; i < amount; i++) {
			System.out.println(this.text);
		}
	
}

	@Override
	public void run() {
		this.print(Printer.AMOUNT);
		
	}
}