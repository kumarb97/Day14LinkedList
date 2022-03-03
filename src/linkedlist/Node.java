/**UC1 : PROBLEM STATEMENT
 * Lets create a simple Linked List of 56, 30 and 70
 *
 */
package linkedlist;

/*
 * Creation of Node with parameter 
 * data- to store the value
 * next- reference to next node
 */
public class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node{" + "data=" + data + ", next=" + next + '}';
	}

}
