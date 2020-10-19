
public class LocalClass1 {

	public static void main(String[] args) {

		String name = "mainClass";
	class LocalClass {
		String myName = "localClass";

		public LocalClass(String name) {
			this.myName = name;
		}

		public void print() {
			System.out.println("My name is " + myName + " and I am enclosed by " + name);
		}
	}
	
	LocalClass lc1 = new LocalClass("test");
	LocalClass lc2 = new LocalClass("rest");

	lc1.print();
	lc2.print();
	}

}
