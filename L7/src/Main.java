
public class Main {

	public static void main(String[] args) {
		coin c1 = new coin(5.0);
		coin[] arry = new coin[5]; // ชช่องใส่เหรียญ ยังไม่ใส่ข้อมูล // arry = varlocal // ฮีฟ คือ new coin[5]
		arry[0] = c1; // อ้างถึงข้อมูลตัวเดียวกัน
		arry[1] = new coin(4.0); //เป็นการชื้ถึงข้อมูลตัวเดียวกัน
		arry[2] = new coin(5.0);
		arry[3] = new coin(2.0);
		arry[4] = new coin(1.0);
		
		Box box = new Box(5);
		for(int i =0 ;i<arry.length;i++) {
			box.add(arry[i]);
		}
		for(coin coin : box.getcoin()) {
			System.out.println(coin.getcoin());
		}
		
		coin[] coins = box.getcoin();
		for(coin coin : coins) {
			System.out.println(coin.getcoin());
		}
		System.out.println("================");
		for(int i=0;i<coins.length;i++) {
			System.out.println(coins[i].getcoin());
		}
		box.add(new coin(7.5));
		box.changAt_i(5.2, 3);
		//ตำแหน่งของวัตถุเฉยๆ  เพราะยังไม่ได้ชี้ไปยังข้อมูลที่อยู่ในนั้น
		for(int i =0 ;i<arry.length;i++) {
			System.out.println(arry[i].getcoin());//จะให้ค่าของข้อมูลออกมาได้เมื่อเราต้องทำการจุด get ออกมา เพื่อนำค่าออกมา
		}
		System.out.println("============");
		//เรียก method getcoin ของ obj ผ่านทาง arr [i] 
		for(int i =0 ;i<box.getSize();i++) {
			System.out.println(box.getcoin(i).getValue());
			//box.getcoin(i) = เป็นการอ้างถึงตำแหน่งของเหรียญ 1 เหรียญ ซึ่งมีนมีหลายตัว แล้วให้ทำการส่งค่ากลับมา
			//.getValue() = เป็นการ return ค่าของ coin มา
		}
	}

}
