import java.util.Arrays;
import java.util.*;
import java.util.Set;
import java.util.stream.*;

public class SetPracticse {

	public static void main(String[] args) {
		Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
		System.out.println(distinctWords.size() + " distinct words" + distinctWords);
		
		// using for each 
		Set<String> s = new HashSet<>();
		for(String a : args) {
			s.add(a);
			System.out.println(s.size() + " distinct words: " + s);
		}
		
		int  b[] = {2, 3, 1, 0, 5};
	}
}
