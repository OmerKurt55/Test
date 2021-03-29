package list;

public class ListElement {
	private String data;
	private ListElement next;
	
	ListElement(String data) {
		this.data = data; 
	}
	
	void setNext(ListElement next) { 
		this.next = next;
	}
	
	ListElement getNext() {
		return this.next;
		}
	
	String getData() { 
		return this.data;
		}
}
