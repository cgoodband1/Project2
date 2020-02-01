/**
	 *The link class is used to create a stack using a Single linked list. Stack creates the stack. Push pushes the object onto the 
	 *stack. Pop removes the object from the stack. IsEmpty check to see is the stack 
	 *is empty or not. Is full returns false as a link list cannot be full. Display stack
	 *prints the stack from top to bottom. 
	 * 
	 * @author <Chase Goodband>
	 * @version<10/25/2019>
	 * 
	 *
	 */
public class Link {
	
private country first;                // ref to first on list
	
	
	/**
	 * this method makes first equal to null
	 */
	public void LinkList()          //constructor
	{
		first = null;               //no items on list yet
	}
	/**
	 * thsi method checks if the stack is empty it returns true if it is empty 
	 * @return this returns true if the stack is empty 
	 */
	public boolean isEmpty()        //true if list is empty 
	{
		return (first == null);
	}
	/**
	 * this methid checks to see if the stack is full
	 * @return this returns fall all the time because a linked list cannot be full
	 */
	public boolean isFull()          //always false 
	{
		return false;
	}
	/**
	 * this methid inserts a country object at the top of a stack.
	 * @param dd this is a country object
	 */
	public void insertFirst(country dd)           //insert at start of list
	{                                      
		dd.next = first;                     //newLink -> old first 
		first = dd;                          //first -> newLink
	}
	
	/**
	 * this method removes a country object from the top of the stack.
	 * @return this returns the country object that is removed.
	 */
	public country deleteFirst()                           //delete first item 
	{                                           //assume list is not empty 
		country temp = first;                      //save reference to link 
		first = first.next;                     //delete it: first -> old next
		return temp;                            //return deleted link
	}
    /** 
     * this method prints out the stack created by a link list from the top of the stack
     * to the bottom of the stack.
     */
	public void displayList() 
	{
		country current = first;
		while(current != null)
		{
			current.print();
			current = current.next;
		}
		System.out.println("");
	}
}
