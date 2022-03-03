
package linkedlist;

/*
 * Creation of Node with parameter 
 * data- to store the value
 * next- pointer to next node
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
