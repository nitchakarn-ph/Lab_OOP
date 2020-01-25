import java.util.Scanner;

public class TestL7 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int [] myarr; //var Arry
		myarr = new int [5]; //obj array
		//10-50
		int[][] M;
		M = new int[5][2]; //[row][col]
		// 10 20
		// 30 40 
		// 50 60
		// 70 80
		// 90 100
		System.out.println(M.length);
		System.out.println(M[0].length);// numcol of 0
		System.out.println(M[1].length);
		System.out.println(M[4].length);// numcol of 4
		int k = 10;
		int i,j;
 		for( i=0 ;i<M.length;i++) {
 			for( j=0 ;j<M[0].length;j++) {
 				M[i][j] = k;
 				k = k+10;
 				System.out.print(M[i][j] + " ");
 				//System.out.print(k +" ");
 			}
 			System.out.println();
 		}
		
		
		
		
		
		
		
	/*	for(int i=0; i<myarr.length;i++ ) {
			myarr[i] = (i+1)*10;
			/*myarr[0] = 10;
			myarr[1] = 20;
			myarr[2] = 30;
			myarr[3] = 40;
			myarr[4] = 50;	
			System.out.println(myarr[i]);
		}
		//100-10
		System.out.println(" ");
		int result = 100;
		for(int i=0; i<myarr.length;i++) {
			myarr[i] = result;
			result = result -10;
			
			System.out.println(result);
		}
		System.out.println(myarr.length);
		if (myarr.length == 0) {
			
		}*/

	}

}
