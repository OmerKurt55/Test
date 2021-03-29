package queue;

public class OurQueue<T> implements Queue<T> {
	
	private final T[] dataArray;
	private final int len;
	private int nextIn = 0;
	private int nextOut = -1;
	
	public OurQueue(int len) {
	this.dataArray = (T[]) new Object[len];
	this.len = len;
	}

	@Override
	public void add(T newData) throws QueueException {
		
		if(this.nextIn < len) {
			this.dataArray[this.nextIn++] = newData;
			if(this.nextOut < 0) this.nextOut = 0;
			} else {
			// reached end of array
			if(this.nextOut == 0) {
				throw new QueueException("Queue full");
			}
			// shift
			this.shiftLeft();
			// do it again
			this.add(newData);
			}
	}
	private void shiftLeft() {
		
		int numberData = this.nextOut - this.nextIn;
		for(int i = 0; i < numberData; i++) {
		this.dataArray[i] = this.dataArray[i+this.nextOut];
		}
		this.nextOut = 0;
		this.nextIn = numberData;
		
	}

	@Override
	public T remove() throws QueueException {
		
		if(this.nextOut >= 0 && this.nextOut < this.nextIn) {
			T data = this.dataArray[this.nextOut];
			this.nextOut++;
			return data;
			} else {
			throw new QueueException("Queue empty");
			}
	}

}
