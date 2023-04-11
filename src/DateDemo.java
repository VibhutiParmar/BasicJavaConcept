import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(d));
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

}
