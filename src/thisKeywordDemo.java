
public class thisKeywordDemo {
	
	int a = 3;
	public void getData() {
		int a = 5;
		System.out.println(a);
		System.out.println(this.a);
		// this refers to current object - the scope of object lies in class level
		System.out.println("Sum of both a is :" + (a+this.a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeywordDemo td = new thisKeywordDemo();
		td.getData();

	}

}
