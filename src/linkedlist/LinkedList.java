package linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	/*
	 * Method push adds a node & assigns head to a node added at first
	 * @param data - stores the value in node
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
	}
	/*
	 * Method print - prints the nodes
	 * 
	 */
	public void print() {
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}
	}
	/*
	 * Method append - to add nodes from last.
	 * @param data - value stored in node.
	 */
	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			this.tail.next = newNode;
			tail = newNode;
		}
	}
	/*
	 * Method insertInBetween - Adds the nodes between any two given nodes.
	 * @previousNode - shows prevoius of given node
	 */

	public void insertInBetween(Node previousNode, Node newNode) {
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;
	}

}
