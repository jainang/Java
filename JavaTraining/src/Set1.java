import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Set1 {
	public static void main(String[] args) {
		// using java 8
		Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
		
		Set<String> s = new HashSet<String>();
		for(String a : args) {
			s.add(a);
		
	    
		}
	}

}
