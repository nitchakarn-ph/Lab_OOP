
public class Box {
	private coin[] arr;
	private int nextIndex;
	
	public Box() {
		this.arr = new coin[5]; //���ҧ�������ҧ�ԧ 5 ���
	}
	public Box (coin[] arr){
		this.arr = arr;
		this.nextIndex = 0; //��ǹѺ �ͺ
	}
	public Box(int num) {
		this.arr = new coin[num];
		this.nextIndex = 0;
	}
	public coin[] getcoin () {
		return this.arr;
	}
	public void add(coin coin) {
		if(this.nextIndex<this.arr.length) {
		this.arr[nextIndex] = coin;
		this.nextIndex++;
		}else {
			System.out.println("OverFlow!!");
		}
	
	}
	public void changAt_i(double val,int i) {
		// check i and length of this.arr
		//*****
		if(i>arr.length | i < 0) {
			System.out.println("Error of index");
		}
		else {
			this.arr [i].setcoin(val); // val �����  obj ��� arr ��ҧ�֧
			System.out.println("arr [" + i+ " ]" + " = "+this.arr[i].getcoin());
		}
	}
	public int getSize() {
		return arr.length;
	}
	public coin getcoin(int i) {
		return this.arr[i];
	}
}
