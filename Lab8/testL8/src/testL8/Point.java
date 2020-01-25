package testL8;

public class Point {
	private double x ;
	private double y;
	
	
	public Point() {
		
	}
	public Point(double first,double second) {
		this.x = first;
		this.y = second;
	}
	public void setx(double first) {
		this.x = first;
	}
	public double getx() {
		return this.x;
	}
	public void sety(double second) {
		this.y = second;
	}
	public double gety() {
		return this.y;
	}
}
