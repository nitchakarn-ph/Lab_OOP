package lab1;

public class main {

	public static void main(String[] args) {
		int var1 = 31; // �红����� same C
		double var2 = 3.21;
		String var3 = "Java"; // S �˭�����
		System.out.println(var3); // printf

		int[] arr1 = new int[5]; // make to object for use in array // array
		arr1[0] = -1;
		arr1[1] = 22;
		arr1[2] = 33;
		arr1[3] = 15;
		arr1[4] = -9;

		int[] arr2 = { 101, 102, 103 }; // array

		// for loop
		int max=arr1[0]; //���ж���ҡ��Ҥ��������鹢ͧ����ѹ��������ӹǹź ����ѹ�դ�ҹ��¡��� 0 �ѧ�����ҵ�ͧ��˹����������鹢ͧ���������դ����ҡѺ����á
		int min=arr1[0];
		System.out.println(arr1.length);// size of array
		for (int i = 0; i < arr1.length; i++) {
			// 11 15
			if (i == 0 || i == 3) {
				// System.out.println(arr1[i]);
			}
			if (arr1[0] > arr1[i]) {
				min = arr1[i];
				System.out.print("min =");
				System.out.println(arr1[i]);
			} else if (arr1[i] <= arr1[i + 1]) {
				max = arr1[i + 1];
				//System.out.println(arr1[i + 1]);
			}
		}
		System.out.print("max =");
		System.out.println(max);
		int N=5;
		for (int i=0;i<N;i++)
		{
//loop ��ҧ㹨л��鹡�͹ loop ��ҧ�͡ �¡����� loop 㹷�˹�ҷ�� ���� ������� loop �͡ ��˹�ҷ�����㹨ӹǹ���Ŵŧ��
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}
		
}
