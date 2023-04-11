
public class StaticKeywordExample {
	
	String name;
	String address;
	static String city;
	static int i; 
	
	//static block use to initialize static variable
	static {
		city = "Calgary";
		i = 0;
	}
	
	StaticKeywordExample(String name, String address){
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address + ", " +    city);
		
	}
	
	public static void getCity() {
		System.out.println("In static method only static variable allow - " + city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticKeywordExample st = new StaticKeywordExample("Vibhuti", "171 Skyview Bay NE");
		StaticKeywordExample st1 = new StaticKeywordExample("Vivek", "181 Skyview Bay NE");
		st.getAddress();
		st1.getAddress();
		StaticKeywordExample.getCity(); // we can call static method with class name
		

	}

}
