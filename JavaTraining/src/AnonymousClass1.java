import java.util.Comparator;
import java.util.PriorityQueue;

public class AnonymousClass1 {
	public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<Integer>(myCustomComparator);
	}

	static Comparator<Integer> myCustomComparator = new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2) {
			return (int) Math.pow(-1, i1) * (i1 - i2);
		}

	};

}
