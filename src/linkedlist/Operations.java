package linkedlist;

public class Operations {
	
	/*
	 * Method addDataAtStart - Adds the node at first.
	 * 
	 */
	public static void addDataAtStart() {
		LinkedList linkedList = new LinkedList();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.print();
	}
	/*
	 * Method addDataAtEnd - Adds node at last.
	 * 
	 */
	public static void addDataAtEnd() {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
	}
	


}
