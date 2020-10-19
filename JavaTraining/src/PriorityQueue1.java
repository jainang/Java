import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		pQ.add(10);
		pQ.add(20);
		pQ.add(24);
		pQ.add(30); 
		pQ.add(35); 
		pQ.add(45); 
		pQ.add(50);
		
	   System.out.println("Priority queue values are: " + pQ); 
	   
	   Comparator comp = pQ.comparator();
	   
       // Displaying the comparator values 
       System.out.println("Since the Comparator value is: " + comp); 
       System.out.println("it follows natural ordering"); 
	}

}
