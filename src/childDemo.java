
public class childDemo extends parentDemo {
	
	public childDemo() {
		super(); //must be first line 
		System.out.println("Child class Constructor");
		
	}

	String name = "Parmar";
	
	public void getData() {
		super.getData();
		System.out.println(name);
		System.out.println(super.name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo cd = new childDemo();
		cd.getData();
	}

}
