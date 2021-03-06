import java.util.*;

public class FindDups {
	
	public static void main(String[] args) {
		Set<String> uniques = new HashSet<>();
		Set<String> dups = new HashSet<>();
		
		for(String a : args) {
			if(!uniques.add(a)) {
				dups.add(a);
			}
		}
		

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
		
		
	}

}
