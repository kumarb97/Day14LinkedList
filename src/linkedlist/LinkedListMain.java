/**UC4 : PROBLEM STATEMENT
 * Lets create a simple Linked List of 56, 30 and 70 Add in between.
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
	 * 2. Taking input and operation is performed (Adding nodes in between)
	 * 3. Printing linkedList
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to linkedList DataStructure Program");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add the data at the start");
		System.out.println("Enter 2 to add the data at the end");
		System.out.println("Enter 3 to add the data in between");
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
		}
        scanner.close();
	}

}
