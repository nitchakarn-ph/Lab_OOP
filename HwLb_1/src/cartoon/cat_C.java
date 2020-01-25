package cartoon;

public class cat_C {
	public String name;
	private double weight;
	protected String emotion;
	
	public void display() {
		weight = 10.5;
		System.out.print("Name : ");
		System.out.println(name);
		System.out.print("Weight is : ");
		System.out.println(weight+" kg.");
		System.out.print("Emotion : ");
		System.out.println(emotion);
}
}
