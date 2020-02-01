/**
	 *The stack class calls the methods used in the Link class to create a stack using
	 *a Single linked list. Stack creates the stack. Push pushes the object onto the 
	 *stack. Pop removes the object from the stack. IsEmpty check to see is the stack 
	 *is empty or not. Is full returns false as a link list cannot be full. Display stack
	 *prints the stack from top to bottom. 
	 * 
	 * @author <Chase Goodband>
	 * @version<10/25/2019>
	 * 
	 *
	 */
public class stack {
	private Link theList;
	/**
	 * The method creates the stack using a linked list.
	 */
	public stack()
	{
		theList = new Link();
	}
	/**
	 * Pushes a country object onto the stack. 
	 * @param j it is the country object. 
	 */
	public void push(country j) {
		theList.insertFirst(j);
	}
	/**
	 * THis method removes a country object off the top of the stack.
	 * @return returns the country object that is removed from the stack.
	 */
	public country pop() {
		return theList.deleteFirst();
	}
	/**
	 * This method check to see if the stack is full 
	 * @return it returns false as a linked list cannot be full. 
	 */
	public boolean isFull() {
		return false;
	}
	/**
	 * This method checks if the stack is empty 
	 * @return it returns true if the stack is empty 
	 */
	public boolean isEmpty() {
		return(theList.isEmpty() );
	}
	/**
	 * This method prints the stack from top to bottom. 
	 */
	public void displaystack() {
		System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", "Name","Code", "Capital", "Population", "GDP", "Happiness Rank");
		System.out.println("_ _ _ _ _ _ _ __ _ _ _ __ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ __ _ _ _ ");
		theList.displayList();
	}
}
