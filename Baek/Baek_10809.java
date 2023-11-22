package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_10809 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split(""); // 알파벳 배열 생성
		String[] numArr = new String[alphabet.length]; // input 값과 비교후 값을 넣을 배열 생성
		String b;
		
		b = br.readLine();

		String[] arr = new String[b.length()]; // input 문자열을 한글자씩 잘라서 넣을 배열 생성
		arr = b.split("");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(arr[i].equals(alphabet[j]) && numArr[j] == null) { //input 값과 알파벳 배열 비교
					numArr[j] = String.valueOf(i);	// input 값과 알파벳 값이 같다면 알파벳 위치에 input 위치값 저장
					break;
				}
			}
		}
		
		for(int i = 0; i < numArr.length; i++) {	
			if(numArr[i] == null) {				// 출력 배열 인덱스에 값이 없다면 
				numArr[i] = String.valueOf(-1);	// 인덱스에 -1값 저장
			}
			bw.write(numArr[i] + " ");	// 출력
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
