package testLab5;

public class Ts5Main {

	public static void main(String[] args) {
		MyData a = new MyData(7);
		MyData b = new MyData(3);
		MyData c = new MyData();
		MyData d = new MyData();
		MyData e = new MyData();
		
		String x = "glhdf";
		int y = 5;
	
		a.copy(5);
		b.copy(10);
		// add(....,....)is a static method
		//int f1 = k;
		MyData f = MyData.add(10, 20);//10+20
		
		
		c.copy(MyData.add(5,6));//c=5+6
		c.copy(MyData.add(a,b));//c=a+b
		a.copy(b);//a=b
		c.getAll(a);
	}

}
