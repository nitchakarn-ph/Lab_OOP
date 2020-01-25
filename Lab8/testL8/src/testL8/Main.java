package testL8;

public class Main {
	public static void main(String args[]) {
		Car mycar = new Car("en001","a123","-","car001","JJ");
		
		System.out.println(mycar);
		System.out.println(mycar.getEngine().getId());
		System.out.println(mycar.getEngine().getSeries());
		System.out.println(mycar.getEngine().getDecrip());
		System.out.println(mycar.getEngineInfo());
		
		mycar = new Car("en002","a456","-","car002","KK");
		System.out.println(mycar);
		System.out.println(" new Mycar" + mycar);
		System.out.println(mycar.getEngine().getId());
		System.out.println(mycar.getEngine().getSeries());
		System.out.println(mycar.getEngine().getDecrip());
		System.out.println(mycar.getEngineInfo());
		
		Engine engine = new Engine();
	}

}
