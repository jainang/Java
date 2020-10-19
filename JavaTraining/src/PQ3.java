import java.util.PriorityQueue;

public class PQ3 {

	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>(new StudentComparator());

		Student student1 = new Student("Nandini", 3.2);
		pq.add(student1);
		
		Student student2 = new Student("Anmol", 3.6);
		pq.add(student2);
		
		Student student3 = new Student("Palak", 4.0);
		pq.add(student3);

		// Printing names of students in priority order,poll()
		// method is used to access the head element of queue
		System.out.println("Students served in their priority order");

		while (!pq.isEmpty()) {
			System.out.println(pq.poll().getName());
		}
	}

}
