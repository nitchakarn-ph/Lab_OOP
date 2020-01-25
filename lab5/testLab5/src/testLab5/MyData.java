package testLab5;

public class MyData {
	private  int data;
	
	public MyData() {
		
	}
	public MyData(int a) {
		this.data  = a; //7
	}
	public  void copy(int b) {
		this.data=b; //data(1)7=5 //5
	}
	public void copy(MyData add1) {
		this.data = add1.data;
	}
	public static MyData add(MyData A,MyData B) {
		MyData sum = new MyData();
		sum.data = A.data + B.data;
		
		return sum;
	}
	//MyData f = MyData(var).add(10, 20);
	public static MyData add( int f1,int f2) {
		//int sum = f1+f2
		//int y;
		MyData result = new MyData();
		//sum = 10;
		//70 = 10+20;
		//i=o
		//7=10+20>>30
		result.data = f1+f2;//30
		return result;
	}
	public MyData getAll(MyData add) {
		System.out.println("1236");
		System.out.println();
		return add;
	}
	
}
