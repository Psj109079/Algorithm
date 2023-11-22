package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek_10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == num) {
                cnt++;
            }
        }
        
        bw.write(String.valueOf(cnt));
        
        br.close();
        bw.flush();
        bw.close();
    }
}