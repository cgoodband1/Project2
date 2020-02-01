
public class FirstLast {
	private country first;              //ref to first link
	private country last;               //ref to last link
	
	/**
	 * This sets first and last to null
	 */
	public FirstLast(){
		first = null;
		last = null;
	}
    /**
     * This checks if the queue is empty or not
     * @return it returns true if the queue is empty 
     */
	public boolean isEmpty()        // true if no links
	{
		return (first == null);
	}
	/**
	 * this checks if the queue is full.
	 * @return it returns false everytime as a linked list cannot be full.
	 */
	public boolean isFull()
	{
		return false;
	}
	/**
	 * this method inserts a country object at the front of a queue. 
	 * @param d this is a country object. 
	 */
	public void insertFront(country d)       //insert at front of list 
	{
		    
		//d.next = first;                     //newLink -> old first 
		//first = d;             //first --> newLink
		
		
		if( isEmpty() )                    //if empty list
		{
			first = last =  d;               //first --> newLink
		}
		else
		{
				first.prev = d;                 //old last --> newLink
				d.next = first;
				first = d;
		}
		
		                      // newLin <-- last 
	}
	/**
	 * Inserts a country object at the end of the queue 
	 * @param d this is a country object 
	 */
	public void insertEnd(country d)          //insert at end of list
	{
		
		if( isEmpty() )                    //if empty list
		{
			first = last =d;
			
		}
		else
		{
				last.next = d;                   //old last --> newLink
				d.prev = last;
				                     // newLin <-- last 
		}	
		last = d;  
	}
	/**
	 * this method removes a country object at the front of a queue
	 * @return this returns the country object that has been removed from the front
	 */
	public country removeFront()
	{
		
		country temp = first;
		if(first.next == null)
		{
			last = null;
		}
		else 
		{
			first.next.prev = null;
			
		}
		first = first.next;
		return temp;
	}
	/**
	 * this method removes a country object at the end of a queue
	 * @return this returns the country object that is removed from the end 
	 */
	public country removeEnd()
	{
		country temp = last;
		//System.out.println(temp.getName());
		//if(last==null)
			//return null;
		if(first.next == null)
		{
			first = null;
			
			
		}
		else
		{
			last.prev.next = null;
		}
		last = last.prev;
		return temp;
	}
	/**
	 * this method displays the queue from the front to the end. 
	 */
	public void displayQueueList()
	{
		
		country current = first;
		while(current != null)
		{
			current.print();
			current = current.next;
			
		}
		System.out.println(" ");
	}
	/**
	 * This method traverses through the link list searching for the country method 
	 * that has a GDP per capita between 30K and 50k and deletes the country object 
	 * @return this returns the country object that this removed. 
	 */
	public country deleteKeys()
	{
		country current = first;
		
		while(current != null)
		{
			if(current.getGDPPerCapita() >= 30000 && current.getGDPPerCapita() <= 40000)
			{
				if(current == first)
				{
					current.next = first;
					first.prev = null;
				}
				else if(current == last)
				{
					current.prev = last;
					last.next = null;
				}
				else
				{
					current.next.prev = current.prev;
					
					current.prev.next = current.next;
				}
			}
			current = current.next;
		}
		return current;
	}

	
	
}



