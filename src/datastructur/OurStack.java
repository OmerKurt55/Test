package datastructur;
// ARRAY
class OurStack<T> implements Stack<T> {
	private final T[] dataArray;
	private final int len;
	private int nextIndex = 0;
	
	OurStack(int len) {
		this.dataArray = (T[]) new Object[len];
		this.len = len;
}
	@Override
	public void push(T newData) throws StackException {
		if(this.nextIndex < len) {
			this.dataArray[nextIndex++] = newData;
			} else {
			throw new StackException("stack is already full");
			}

		
	}
	@Override
	public T pop() throws StackException {
		if(this.nextIndex > 0) {
			this.nextIndex--;
			T data = this.dataArray[this.nextIndex];
			return data;
			} else {
			throw new StackException("stack is empty");
			}
	}
}