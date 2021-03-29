package list;

public class List {
	private ListElement first = null;
	
	void addData(String newData) {

	// create new ListElement with data
	ListElement newElement = new ListElement(newData);
	// find last element
	ListElement lastElement = this.getLastElement();
	
	if(lastElement == null) {
	this.first = newElement;
	
	} else {
	lastElement.setNext(newElement);
	
	}
	}
	
	
	
	ListElement getLastElement() {
		
	if(this.first == null) {
	return null;
	}
	ListElement last = this.first;
	ListElement next = null;
	do {
	next = last.getNext();
	if(next != null) {
	last = next;
	}
	} while(next != null);
	return last;
	}


}
