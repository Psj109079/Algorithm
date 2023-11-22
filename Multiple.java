import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, temp;
		
		A = sc.nextInt();
		B = sc.nextInt();
		temp = B;
		while(B != 0) {
			System.out.println(A * (B % 10));
			B /= 10;
		}
		B = temp;
		System.out.println(A * B);
		sc.close();		
	}

}
