import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello!");
		hm.put(1, "Good Bye!");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		System.out.println(hm.get(1));
		Set st = hm.entrySet();
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp = (Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}

}
