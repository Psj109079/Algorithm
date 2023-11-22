package Baek;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

class Self_Num {
	
	int sum;
	
	int selfNum(int n) {
		sum = n;
		while(n > 0) {
			sum += n % 10;
			n /= 10;  
		}
		return sum;
	}
}

public class Baek_4673 {

	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Self_Num sf = new Self_Num();
		boolean[] selfN = new boolean[10001];
		int n;
		
		for(int i = 1; i <= 10000; i++) {
			n = sf.selfNum(i);
			if(n <= 10000) {
				selfN[n] = true;
			} 
			if(selfN[i] == false) {
				bw.write(String.valueOf(i) + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}


  
	
