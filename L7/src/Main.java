
public class Main {

	public static void main(String[] args) {
		coin c1 = new coin(5.0);
		coin[] arry = new coin[5]; // ���ͧ�������­ �ѧ����������� // arry = varlocal // �տ ��� new coin[5]
		arry[0] = c1; // ��ҧ�֧�����ŵ�����ǡѹ
		arry[1] = new coin(4.0); //�繡�ê��֧�����ŵ�����ǡѹ
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
		//���˹觢ͧ�ѵ�����  �����ѧ���������ѧ�����ŷ������㹹��
		for(int i =0 ;i<arry.length;i++) {
			System.out.println(arry[i].getcoin());//������Ңͧ�������͡�����������ҵ�ͧ�ӡ�èش get �͡�� ���͹Ӥ���͡��
		}
		System.out.println("============");
		//���¡ method getcoin �ͧ obj ��ҹ�ҧ arr [i] 
		for(int i =0 ;i<box.getSize();i++) {
			System.out.println(box.getcoin(i).getValue());
			//box.getcoin(i) = �繡����ҧ�֧���˹觢ͧ����­ 1 ����­ ����չ�����µ�� �������ӡ���觤�ҡ�Ѻ��
			//.getValue() = �繡�� return ��Ңͧ coin ��
		}
	}

}
