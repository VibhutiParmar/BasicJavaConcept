//one try can be followed by multiple catch block
public class ExceptionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b =5; 
		int c = 0;
		
		try {
			int k = b/c;
			System.out.println(k);
		}
		catch(ArithmeticException  ae) {
			System.out.println("This is an arithmeticexception");
		}
	
		catch(Exception e) {
			System.out.println("I found the error");
			
		}
		finally{
			System.out.println("Delete all the cookies");
			//This block is executed irrespective of exception thrown or not
			//This will executed at the end even if there is an exception in the middle
		}
		
}
}																																																																																													
