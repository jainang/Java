
public abstract class Person {
	
	// class can onlt extends it
	// interface can also implements superinterface.

    int age;
    String firstName;
    String lastName;
    String middleName;
 
    public Person() {
 
    }
 
    public Person(int age, String firstName, String middleName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
 
    // Abstract method must be implemented by the subclass.
    abstract void printFullName();
 
    // Default implementation for defaultAge
    void printAge() {
        System.out.println("Age");
    }
}
