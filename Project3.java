
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
/**
 *The project3 class implements the other classes with the country object. It first 
 *creates all the stacks that seperate the countries by GDP per capital. Next the 
 *class inputs the Countries3.csv and splits the data by the comma and the splits the data into 
 *separate fields. The class then breaks the country objects into 5 stacks based on 
 *GDP per capita. It then pushes only the fair good and vgood groups onto a second 
 *stack while popping the other two groups. Then pop from the stack to a Queue the 
 *first country is inserted at the front of the Queue then the second country is 
 *inserted at the back of the Queue. Then delete the countries that have GDP between 
 *30,000 and 50,000. Remove the countries from the queue to the stack first remove 
 *from the front of the list. Then remove from the back of the list and repeat this 
 *order. Print the stack and exit the program.   
 * 
 * @author <Chase Goodband>
 * @version<10/25/2019>
 * 
 *
 */
public class Project3 {
   
	public static void main(String[] args) throws IOException {
		 stack poor = new stack();
		 stack fair = new stack();
		 stack good = new stack();
		 stack vgood = new stack();
		 stack excellent = new stack();
		 stack s0 = new stack();
		 stack s1 = new stack();
		
		 FileInputStream fstream = new FileInputStream("Countries3.csv");
		 BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));

		 String strLine = reader.readLine(); //Title line
		 
		 while ((strLine = reader.readLine()) != null)   {
			 String[] parts = strLine.split(Pattern.quote(","));
			 
			 country c = new country(parts[0], 
					 parts[1], 
					 parts[2],
					 Long.parseLong(parts[3]), 
					 Double.valueOf(parts[4]).doubleValue(), 
					 Integer.parseInt(parts[5]));

			 /*
			As in project 2, let us again define five groups of countries based on GDP per capita: 
			POOR countries as those with GDP per capita <1 thousand, FAIR no less than 1 thousand 
			but <5 thousand, GOOD no less than 5 thousand but <20 thousand, VGOOD no less than 20 
			thousand but <50 thousand, and EXCELLENT no less than 50 thousand*/
			 
			 if (c.getGDPPerCapita() >= 50000) {
				 excellent.push(c);
			 }
			 else if(c.getGDPPerCapita() >= 20000){
				 vgood.push(c);
			 }
			 else if(c.getGDPPerCapita() >= 5000){
				 good.push(c);
			 }
		     else if(c.getGDPPerCapita() >= 1000){
					 fair.push(c);
		     }
		     else {
				 poor.push(c);
		     }

			 while ( ! fair.isEmpty()) {
					country removedCountry = fair.pop();
					s0.push(removedCountry);
			 }
			while ( ! good.isEmpty()) {
					country removedCountry = good.pop();
					s0.push(removedCountry);
			}
			while ( ! vgood.isEmpty()) {
				country removedCountry = vgood.pop();
				s0.push(removedCountry);
			}
			 
			
			 
			 
	}
		 //Close the input stream
		 fstream.close();
		 
		 System.out.println("Stack");
		 s0.displaystack();
		
		 
		 

	     while(! excellent.isEmpty()) {
			 excellent.pop();
		 }
		 while(! poor.isEmpty()) {
			 poor.pop();
		 }
		 
		 
		 Queue q0 = new Queue();
		 while ( ! s0.isEmpty()) {                   
			q0.insertFront(s0.pop());
			q0.insertEnd(s0.pop());
			 
		 }
		 
		
		 
		 System.out.println("Queue");
		 
		 q0.displayQueue();                      //print queue 
		 
		 q0.deleteKey();
		 
		 System.out.println("Queue");
		 
		 q0.displayQueue();
		 
		 
		
		 System.out.println("Stack");
		 
		 while(! q0.isEmpty())
		 {
			s1.push(q0.removeFront());
			if(q0.isEmpty())
			{
				break;
			}
			s1.push(q0.removeEnd());
			
		 }
		 
		 
		 s1.displaystack();
		 


		 
		 
		 
}
	
	
	
	
}