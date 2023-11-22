class Solution {
    public static int solution(int num) {
        int answer = 0;
        if(num == 1) {
            return 0;
        } else {
            while(num != 1) {
                if(answer >= 500) {
                    answer = -1;
                    break;
                }
                if(num % 2 == 0) {
                    num /= 2;
                    answer++;
                } else if (num != 1 && num % 2 == 1) {
                    num = num * 3 + 1;
                    answer++;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(16));
    }
}
