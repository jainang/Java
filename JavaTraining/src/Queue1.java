import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	
	public static void main(String[] args) throws InterruptedException{
		int time = Integer.parseInt(args[0]);
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i= time; i >=0; i--) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
			
		}
		
	}

}
