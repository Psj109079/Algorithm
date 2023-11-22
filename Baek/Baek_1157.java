package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_1157 {
	public static void main(String[] args)throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String str;
		char ch = ' ';
		int[] arr = new int[26];
		int max = 0;
		
		str =br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); 
			if(ch >= 97) { // toUpperCase 를 사용해서 대문자 변환 할 수 있음.
				ch -= 32;
			}
			ch -= 65;
			arr[ch] += 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				ch = (char)(i + 65);
			} else if(max == arr[i]) {
				ch = '?';
			} 
		}
		bw.write(ch);
						
		br.close();
		bw.flush();
		bw.close();
	}
}
//import java.util.*;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[26]; //알파벳 개수만큼 배열 선언
//		
//		//대문자로 출력하면 되니까, 대문자로 입력받기
//		String a = sc.next().toUpperCase();
//		
//		int max = -1;
//		char st = '?';
//		
//		for(int i=0;i<a.length();i++) {
//			arr[a.charAt(i)-65]++;
//			if(max<arr[a.charAt(i)-65]) {
//				max = arr[a.charAt(i)-65];
//				st = a.charAt(i);
//			}
//			else if(max==arr[a.charAt(i)-65]) st = '?';
//		}
//		System.out.println(st);
//		
//	}
//}
