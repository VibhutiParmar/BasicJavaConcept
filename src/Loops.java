
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		int l = 3;
		for(int i=0; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k*l);
				System.out.print("\t");
				k++;
			}
			System.out.println(" ");
		}

	}

}
