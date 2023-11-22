package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Baek_1009 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int a, b, r;
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken()) - 1;
            r = a;
            if(b == 0) {
                r %= 10;
            } else {
                for(int j = 0; j < b; j++) {
                    r = r * a % 10;
                }
            }
            if(r == 0) {
                r = 10;
            }
            bw.write(r + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
