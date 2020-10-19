import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class List1 {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(4);
		
		list2.add(3);
		list2.add(2);
		
		list1.addAll(list2); // addALL maintains ordering of elements to be added.
		 
		for (Integer num : list1) {   
		    System.out.println(num); 
		}
		
		// java 8 
		List<Integer> list = list1.stream().collect(Collectors.toList());
		
		for (Integer num : list) {   
		    System.out.println(num); 
		}
	}

}
