package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_5622 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().toUpperCase();
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch <= 67) {cnt += 3;}
			else if(ch <= 70) {cnt += 4;} 
			else if(ch <= 73) {cnt += 5;}
			else if(ch <= 76) {cnt += 6;}
			else if(ch <= 79) {cnt += 7;}
			else if(ch <= 83) {cnt += 8;}
			else if(ch <= 86) {cnt += 9;}
			else if(ch <= 90) {cnt += 10;}			
		}
		
		bw.write(String.valueOf(cnt));
		
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}
