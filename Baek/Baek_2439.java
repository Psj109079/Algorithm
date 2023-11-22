package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baek_2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t;
		
		t = Integer.parseInt(br.readLine());
		String s = "*";
		
		for (int i = 0; i < t; i++) {
			String text = String.format("%" + t + "s", s);
			
			bw.write(text + "\n");
			s += "*";
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}