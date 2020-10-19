import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class List2 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);

		list2.add(3);
		list2.add(4);

		list1.addAll(list2); // addALL maintains ordering of elements to be added.

	//	swap(list1, 0, 3);
		
		// Shuffle method 
		
		Collections.shuffle(list1);
		
		for (Integer num : list1) {
			System.out.println(num);
		}
	

	}
	
	public static void swap(List<Integer> list1, int i, int j) {
		Integer temp = list1.get(i);
		list1.set(i, list1.get(j));
		list1.set(j, temp);
	}

}
