package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baek_2908 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" "); 		  // 문자를 띄어쓰기 기준으로 분리
		String[][] strNum = new String[2][];	
		int[] num = new int[strNum.length];
		int max = 0;
		
		for(int i = 0; i < strNum.length; i++) {
			strNum[i] = input[i].split("");				  // 분리한 문자를 strNum의 i열에 숫자 하나씩 분리
			List<String> list = Arrays.asList(strNum[i]); // 문자를 뒤집을 List 생성
			Collections.reverse(list);					  // 문자 반전
			strNum[i] = list.toArray(new String[0]);      // 반전된 문자List를 다시 배열로 변경

			StringBuilder sb = new StringBuilder();		  // 하나씩 나눠진 문자를 다시 합칠 StringBuilder 생성
			for(int j = 0; j < strNum[i].length; j++) {		
				sb.append(strNum[i][j]);				  // sb에 strNum의 i열에 나눠져있던 문자를 다시 합침
			}
			num[i] = Integer.parseInt(sb.toString());	  // 합친 문자를 숫자형으로 변경 후 int 배열에 담음
			sb = new StringBuilder();					  // StrinBuilder 초기화
		}
		
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {							   
				max = num[i];							  // 배열 중 최대값 넣어줌
			}
		}
		
		bw.write(String.valueOf(max));					  // 최대값 출력
		
		br.close();
		bw.flush();
		bw.close();
	}

}
