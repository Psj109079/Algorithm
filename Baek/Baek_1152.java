package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_1152 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().trim(); // 문장 앞뒤 공백제거
		String[] arr = str.split(" ");	   // 공백 단위로 문장 나누기
		
		if(str.isEmpty()) {
			bw.write(String.valueOf(0));
		} else {
			bw.write(String.valueOf(arr.length));			
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
