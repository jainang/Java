
public class PersonImpl extends Person {

	@Override
	void printFullName() {
		System.out.println("Child class");
		
	}
	
    void printAge() {
        System.out.println("child class Age");
    }
	
	public static void main(String[] args) {
		PersonImpl p = new PersonImpl();
		p.printFullName();
		p.printAge();
	}

}
