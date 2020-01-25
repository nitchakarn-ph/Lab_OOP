package testL8;

public class Lines {
	private Point startPoin;
	private Point stopPoint;
	
	
	public Lines() {
		this.startPoin = null;
		this.stopPoint = null;
	}
	public Lines(double x,double y) {
		this.startPoin = new Point(x,y); // point 1
		this.stopPoint = new Point(x,y);// point 2
	}
	
	public Point getLine1() {
		return this.startPoin; // point 1 
	}
	public Point getLine2() {
		return this.stopPoint; // point 2
	}
	private double sqDiff(double x1,double x2) { //double x1 รับ ค่าจาก this.startPoin.getx() 
		return Math.pow(x1-x2, 2);
	}
	public double getlenght (){
		
		double result = Math.sqrt(sqDiff(this.startPoin.getx(),this.stopPoint.getx())+	
				sqDiff(this.startPoin.gety(),this.stopPoint.gety()));
		return result;
		
	}
	/*public void getLineshow() {
		System.out.println("First Point = X : "+this.startPoin.getx());
		System.out.print(" Y : "+this.startPoin.gety());
		System.out.println("Second Point = X : "+this.stopPoint.getx());
		System.out.print(" Y : "+this.stopPoint.gety());
		System.out.println(this.getlenght());
	}*/
	public String getPointInfo() {
		String info = String.format(" First Point = X : %s\t Y : %s\n "
				+ "Second Point = X : %s\t  Y : %s\n Result : %s\n"
				, this.startPoin.getx(),this.startPoin.gety(),this.stopPoint.getx(),this.stopPoint.gety(),this.getlenght());
		return info;
	}

	
}
