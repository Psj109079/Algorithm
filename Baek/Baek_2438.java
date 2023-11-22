package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baek_2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t;
		
		String s = "*";
		t = Integer.parseInt(br.readLine());
		String[] arrayS = new String[t];
		
		for (int i = 0; i < t; i++) {
			arrayS[i] = s.repeat(i + 1);
			
			bw.write(arrayS[i] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
