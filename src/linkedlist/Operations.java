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
	/*
	 * Method insertInBetween - To add node between any two given nodes.
	 * 
	 */
	public static void insertInBetween() {
		LinkedList linkedList = new LinkedList();
		Node secondNode = linkedList.push(70);
		Node firstNode = linkedList.push(56);
		Node newNode = new Node(30);
		System.out.println("Before:");
		linkedList.print();
		linkedList.insertInBetween(firstNode, newNode);
		System.out.println("\nAfter:");
		linkedList.print();

	}
	


}
