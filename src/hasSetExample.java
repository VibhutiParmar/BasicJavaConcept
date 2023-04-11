import java.util.HashSet;
import java.util.Iterator;

public class hasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set interface - HashSet, TreeSet, LinkedHashSet
		// Set does not accept duplicate values
		//There is no guarantee that values store in sequential order...Element store in random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Vibhuti");
		hs.add("Vivek");
		hs.add("Parmar");
	
		System.out.println(hs);
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		hs.add("India");
		System.out.println(hs.size() );
		hs.add("HashSet");
		Iterator<String> it = hs.iterator();
	/*	String first = it.next();
		String second = it.next();
		String third = it.next();
		
		System.out.println(first +" " +second + " " +third); */
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
