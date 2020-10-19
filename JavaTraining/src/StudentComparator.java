import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if (s1.cgpa < s2.cgpa)
			return 1;
		else if (s1.cgpa > s2.cgpa)
			return -1;
		return 0;
	}

}
