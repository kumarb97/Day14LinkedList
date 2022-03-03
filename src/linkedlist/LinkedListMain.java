/**UC9 : PROBLEM STATEMENT
 * Ability to delete after searching data.
 * 
 */
package linkedlist;
import java.util.Scanner;

public class LinkedListMain {

	/*
	 * Main method for manipulation linkedList
     * @param args - Default Java param (Not used)
	 * 
	 */
	
	/*
	 * PROCEDURE-
	 * 1. Operations needs to be performed (using switch case)
	 * 2. Taking input and operation is performed.
	 * 3. Printing linkedList
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to linkedList DataStructure Program");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add the data at the start");
		System.out.println("Enter 2 to add the data at the end");
		System.out.println("Enter 3 to add the data in between");
		System.out.println("Enter 4 to delete data of first node");
		System.out.println("Enter 5 to delete data of last node");
		System.out.println("Enter 6 to find index number,node with value 30 in linked list");
		System.out.println("Enter 7 to Add data after searching required data");
		System.out.println("Enter 8 to delete  after data after searching required data");
		switch (scanner.nextInt()) {
		case 1:
			Operations.addDataAtStart();
			break;
		case 2:
			Operations.addDataAtEnd();
			break;	
		case 3:
			Operations.insertInBetween();
			break;
		case 4:
			Operations.deleteFirstNode();
			break;
		case 5:
			Operations.deleteLastNode();
			break;
		case 6:
			Operations.findNodeBasedOnValue();
			break;
		case 7:
			Operations.insertAfterSearchNode();
			break;
		case 8:
			Operations.deleteAfterNodeAfterSearchNode();
			break;
			}
        scanner.close();
	}

}
