package test1;

public class main {

	public static void main(String[] args) {
		calculator cal = new calculator();
		cal.show();
		
		cal.add(1, 2);
		cal.add(10.5, 20.3);
		
		double result = cal.sub(1.1,0.9); //ตัวแปรที่ใช้ในการเก็บค่าของฟังก์ชัน และยังสามารถนำปใช้งานต่อได้
		System.out.println(result);
		
		calculator cal1 = new calculator(50);
		cal1.show();
		
		cal1.setVal(5);
		cal1.setResult(12.3);
		System.out.println(cal1.getVal()+" : "+cal1.getResult());
	}

}
