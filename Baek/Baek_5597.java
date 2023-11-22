package Baek;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_5597 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] stud = new int[30];
        
        for(int i = 0; i < 28 ; i++) {
            int num = Integer.parseInt(br.readLine());
            stud[num - 1]++;
            
        }
        
        for(int i = 0; i < stud.length; i++) {
            if(stud[i] != 1) {
                bw.write(String.valueOf(i + 1) + "\n");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

}
