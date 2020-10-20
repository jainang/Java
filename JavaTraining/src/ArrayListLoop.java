import java.util.*;

public class ArrayListLoop {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(17);
		al.add(13);
		al.add(10);
		al.add(12);

		for (Integer num : al) {
			System.out.println("Int value " + num);
		}
		
		if(al.contains(3)) {
			System.out.println("yes");
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(17);
		list.add(13);
		list.add(10);
		list.add(12);

		Integer[] arr = (Integer[]) list.toArray(new Integer[list.size()]);

		for (Integer num : arr) {
			System.out.println("Int value array " + num);
		}
		

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);

		for (Integer num : set) {
			System.out.println("Set int value " + num);
		}

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("Set int value " + itr.next());
		}

	}

}
