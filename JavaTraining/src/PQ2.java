import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ2 {
	
	class TheComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			String first;
			String second;
			first = s1;
			second= s2;
			return second.compareTo(first);
		}
		
	}
	
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("G");
		queue.add("A");
		queue.add("C");
		queue.add("B");
		queue.add("D");
		
		

        System.out.println("The elements with the highest priority element at front of queue"
                           + "order:"); 
        for (String element : queue) 
            System.out.print(element + " "); 
	}

}
