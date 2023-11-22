import java.util.Scanner;
import java.util.Random;

public class MutipleGame {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
	    a = (int) (Math.random() * 100) + 2;
	    b = (int) (Math.random() * 100) + 2;

	    Random ran = new Random();
	    int i = ran.nextInt(4);
	    
	    String[] Operator = new String[4];
	    Operator[0] ="+";
	    Operator[1] ="-";
	    Operator[2] ="*";
	    Operator[3] ="/";
	    
	    System.out.println(a + Operator[i] + b + "?");
		c = input.nextInt();
//		
//		if (Operator[i] ==  Operator[0]) {
//			a = (int) (Math.random() * 9999) + 2;
//		    b = (int) (Math.random() * 9999) + 2;
//		} else if (Operator[i] ==  Operator[1] && a >= b) {
//			a = (int) (Math.random() * 9999) + 500;
//		    b = (int) (Math.random() * 9999) + 500;
//		} else if (Operator[i] ==  Operator[2]) {
//			a = (int) (Math.random() * 999) + 100;
//		    b = (int) (Math.random() * 999) + 100;
//		} else if (Operator[i] ==  Operator[3] && a % b == 0) {
//			a = (int) (Math.random() * 999) + 100;
//		    b = (int) (Math.random() * 999) + 10;
//		}
//		
	 
		if (Operator[i] ==  Operator[0] && (c == (a + b))) {
			System.out.println("+ 10Point");
		}else if (Operator[i] ==  Operator[1] && (c == (a - b))) {
			System.out.println("+ 10Point");
		}else if (Operator[i] ==  Operator[2] && (c == (a * b))) {
			System.out.println("+ 10Point");
		}else if (Operator[i] ==  Operator[3] && (c == (a / b))) {
			System.out.println("+ 10Point");
		} else {
	    	System.out.println("- 5Point");	    		
	    	
	    }
		
	
	   input.close();

	}
}

