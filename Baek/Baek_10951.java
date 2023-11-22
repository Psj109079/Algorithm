package Baek;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek_10951 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = 0, b = 0;
		String escape;
		StringTokenizer st;
		
//					escape의 값이 null이 아니면서 escape의 값이 비어있지 않다면 실행
		while((escape = br.readLine()) != null && (!escape.trim().isEmpty())) {
			st = new StringTokenizer(escape);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");		
		}
	
		br.close();
		bw.flush();
		bw.close();
	}
}
