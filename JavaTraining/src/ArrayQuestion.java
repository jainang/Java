import java.util.HashSet;

public class ArrayQuestion {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 10 };
		int b[] = { 2, 3, 1, 0, 5 };

        int n = a.length; 
        int m = b.length; 
          
        findMissingUsingHashMap(a, b, n, m); 
	}

	public static void findMissing(int a[], int b[],int n ,int  m) {
		for (int i = 0; i < n; i++) 
        { 
            int j; 
              
            for (j = 0; j < m; j++) 
                if (a[i] == b[j]) 
                    break; 
  
            if (j == m) 
                System.out.print(a[i] + " "); 
        } 
	}
	
	public static void findMissingUsingHashMap(int a[], int b[],int n ,int  m) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<m; i++) {
			set.add(b[i]);
		}
		
		for(int i=0; i<n; i++) {
			if(!set.contains(a[i])) {
				System.out.println("Elements not present in array b " + a[i]);
			}
		}
	}
	
	
}
