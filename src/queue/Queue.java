package queue;

public interface Queue<T> {

	void add(T newData) throws QueueException;
	T remove() throws QueueException;
}
