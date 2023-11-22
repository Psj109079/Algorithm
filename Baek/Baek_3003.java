package Baek;
import java.util.Arrays;
import java.util.Scanner;

public class Baek_3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int piece; 
		int[] chessPiece = {1,1,2,2,2,8};
		int[] check = new int[6];
		
		for(int i=0; i < chessPiece.length; i++) {
			piece = sc.nextInt();
			check[i] = chessPiece[i] - piece;
//			System.out.println(check[i]);
		}
		System.out.println(Arrays.toString(check));
		sc.close();
		

	}

}
