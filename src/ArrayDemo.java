
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[3];
		a[0] = 3;
		a[1] = 4;
		a[2] = 1;
		
		int[] b = {3, 6, 7, 9, 7};
		
		int [] c =new int[2];
		c[0] = 10;
		c[1] = 20;
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("a :" + a[i]);
		}
		System.out.println("==================");
		for(int i = 0; i<b.length; i++) {
			System.out.println("b :" + b[i]);
		}
		System.out.println("==================");
		for(int i = 0; i<c.length; i++) {
			System.out.println("c :" + c[i]);
		}
		System.out.println("==================");
		
		int [][] x = {{1,2,3},{4,5,6}};
		for(int i =0; i<2; i++)
		{
			for(int j =0 ; j<3; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
