/**UC5 : PROBLEM STATEMENT
 * Ability to delete first element
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
	 * 2. Taking input and operation is performed (to delete first element)
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
		}
        scanner.close();
	}

}
