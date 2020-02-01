/**
	 *The queue class calls the methods used in the Link class to create a queue using
	 *a double linked list. queue creates the queue. insertfront inserts the object at the 
	 *front of the Queue. insertEnd inserts the object at the end of the Queue.  IsEmpty check to see is the queue is empty or not.
	 *  Is full returns false as a link list cannot be full. Display queue
	 *prints the queue from front to back. Remove front removes the country object
	 *from the front of the queue.  Remove End removes the country object from the
	 * End of the queue. DeleteKey finds the wanted key and deletes the key from the queue.  
	 * 
	 * @author <Chase Goodband>
	 * @version<10/25/2019>
	 * 
	 *
	 */
public class Queue {

	private Link1 theList;
	
	/**
	 * This method creates the queue with a double Linked list.
	 */
	public Queue() {
		theList = new Link1();
	}
	/**
	 * This method checks if the queue is empty
	 * @return returns true if the queue is empty 
	 */
	public boolean isEmpty()
	{
		return theList.isEmpty();
	}
	/**
	 * checks if the queue is full
	 * @return returns false at all times because a linked list cannot be full 
	 */
	public boolean isFull()
	{
		return false;
	}
	/**
	 * Inserts a country object at the front of the queue 
	 * @param j this is a country object 
	 */
	public void insertFront(country j)
	{
		theList.insertFront(j);
	}
	/**
	 * inserts a country object at the end of a queue
	 * @param j this is a country object.
	 */
	public void insertEnd(country j)
	{
		theList.insertEnd(j);
	}
	/**
	 * this removes a country object from the front of a queue. 
	 * @return this returns the country object that is removed. 
	 */
	public country removeFront()
	{
		return theList.removeFront();
	}
	/**
	 * this removes a country object from the end of a queue. 
	 * @return this returns the country object that is removed.
	 */
	public country removeEnd()
	{
		return theList.removeEnd();
	}
	
	/**
	 * This object searches for the key that is needed and then deletes that country 
	 * object. 
	 * @return this returns the country object that is deleted. 
	 */
	public country deleteKey()
	{
		return theList.deleteKeys();
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * this method prints the queue from the from to the back.
	 */
	public void displayQueue() {
		System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", "Name","Code", "Capital", "Population", "GDP", "Happiness Rank");
		System.out.println("_ _ _ _ _ _ _ __ _ _ _ __ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ _ _ _ _ __ _ _ __ _ _ _ ");
		theList.displayQueueList();
	}
	
}
