
public class ConstructorDemo {

	//Constructor will not return values
	//name of constructor must be same as Class name.
	
	//Type 1 : Default Constructor 	
	public ConstructorDemo() {
		System.out.println("I am in the Constructor");
	}
	
	//Type 2 : Parameterize Constructor
	public ConstructorDemo(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public ConstructorDemo(String str) {
		System.out.println(str);
	}
	
	public void getData() {
		System.out.println("I am in the getData");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorDemo cd = new ConstructorDemo();
		//ConstructorDemo cdp = new ConstructorDemo(5,10);
		//ConstructorDemo cds = new ConstructorDemo("Vibhuti");
	}

}
