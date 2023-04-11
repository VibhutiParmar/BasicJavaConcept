import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Vibhuti");
		a.add("Vivek");
		a.add(0, "Parmar");
		System.out.println(a);

		System.out.println(a.get(2));
		System.out.println(a.contains("Vibhu"));
		System.out.println(a.indexOf("Vibhuti"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.add("Vibhuti");
		System.out.println(a); 
		
		// list accept the duplicate value					
		//Arraylist can grow dynamically					//array has static size
		//can access and inser any value at any index
	}

}
