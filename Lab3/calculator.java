package test1;
public class calculator {
	private int val;
	private double result;
	//constructor
	public calculator(){
		//modifile nameClass()
		System.out.println("calculator()");
	}
	public calculator(int val) {
		this.val = val;
		System.out.println("calculator(int x)");
	}
	
	//set �觾������������
	//get retrun ��������͡��
	public void  setVal(int val) {
		this.val=val;
	}
	public int getVal() {
		return this.val;
	}
	
	public void  setResult(double result) {
		this.result=result;
	}
	public double getResult() {
		return this.result;
	}
	
	
	public void show() {
		System.out.println(this.val);
	}
	public void add(double x,double y) //�Ԥ����� ���Ϳѧ��ѹ����͹�ѹ������ö�Ѻ��ҵ�ҧ�ѹ��
	{
		System.out.println(x+y);
		
	}
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public double sub(double x,double y){
		return x-y;
	}
	
}
