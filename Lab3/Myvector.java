package test1;

public class Myvector {
	private int[] vector1;
	private int[] vector2;
	private int[] result;
	
	public void  setVector1(int[] vector1) {
		this.vector1=vector1;
	}
	public int[] getVector1() {
		return this.vector1;
		
	}
	
	public void  setVector2(int[] vector2) {
		this.vector2=vector2;
	}
	public int[] getVector2() {
		return this.vector2;
	}
	
	public void  setResult(int[] result) {
		this.result=result;
	}
	public int[] getResult() {
		return this.result;
	}
	
	public Myvector() {
		//System.out.println("Myvector haven't parameter");
	}
	public  Myvector(int[] vector1,int[] vector2) {
		this.vector1=vector1;
		this.vector2=vector2;
		//System.out.println("Myvactor have parameter");
	}
	
	public void sumVectors() {
		result = new int[vector1.length];
		for(int i=0;i<result.length;i++) {
			result[i]=vector1[i]+vector2[i];
			
		}
	}
	public void showResults() {
		for(int i=0;i<result.length;i++) {
			//result[i]=vector1[i]+vector2[i];
		System.out.println("Result["+i+"] :"+ result[i]);
		}
	}
	
}
