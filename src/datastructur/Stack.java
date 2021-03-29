package datastructur;

public interface Stack<T>{
	void push(T newData) throws StackException;
	T pop() throws StackException;
}
