package Cartoon;

public class C {
	public String name;
	private double weight;
	protected String emotion;
	
	public void display() {
		weight = 10.5;
		System.out.print("Name : ");
		System.out.println(name);
		System.out.print("Weight is : ");
		System.out.println(weight);
		System.out.print("Emotion : ");
		System.out.println(emotion);
	}

}
