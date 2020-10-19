
public class Student {
	
	public String name; 
    public double cgpa;
	public Student(String name, double cgpa) {
		this.cgpa = cgpa;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	} 
    
    

}
