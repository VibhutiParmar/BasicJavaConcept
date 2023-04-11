
public class MinNOFromMDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,4,7},{3,8,10},{4,6,0}};
		int min = a[0][0];
		int min_col = 0;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(a[i][j]<min) {
					min = a[i][j];
					min_col = j;
				}
			}
		}
		System.out.println(min);

		int max = a[0][0];
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(a[i][j]>max) {
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
		
		
		int maxOfMinNo = a[0][min_col];
		
		for(int k=0; k<3; k++) {
		if(a[k][min_col]>maxOfMinNo) {
			maxOfMinNo = a[k][min_col];
		}
		}
		
		System.out.println("Max from Min number col: " + maxOfMinNo);
		
		
		
	}

}
