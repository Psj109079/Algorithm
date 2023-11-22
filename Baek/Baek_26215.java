package Baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class Baek_26215 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); // 집의 수
        List<Integer> a = new ArrayList<>(); 
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()); // 눈의 양 입력
        while(st.hasMoreTokens()) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        if(n == 1) { // 집이 1개일경우
            cnt = a.get(0); // 눈의 양 == 걸린시간
        } else {
            while(true) {
                Collections.sort(a, Collections.reverseOrder()); // 내림차순정렬
                if(a.get(0) <= 0) { // 정렬 후 0번 인덱스값이 0 이면 눈을 다 치웠기때문에 종료
                    break;
                }
                if(a.get(1) <= 0) { // 1번인덱스가 0보다 작으면 다른집 눈은 다 치우고 한집 남음
                    a.set(0, a.get(0) - 1);
                } else { // 아니라면 두집씩 치우기
                    a.set(0, a.get(0) - 1);
                    a.set(1, a.get(1) - 1);
                }
                cnt++; // 걸린시간
            }
        }

        if(cnt > 1440) {
            cnt = -1;
        }
        
        bw.write(String.valueOf(cnt));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
