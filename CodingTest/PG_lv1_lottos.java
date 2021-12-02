import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int cnt = 0;

        Arrays.sort(lottos);
        for(int i=0;i<6;i++) {
            if(lottos[i] != 0) break;
            cnt++;
        }

        Arrays.sort(win_nums);
        for(int j=0;j<6;j++) {
            for(int k=cnt;k<6;k++) {
                if(win_nums[j] != lottos[k]) continue;
                answer[0]++;
                answer[1]++;
            }
        }

        answer[0] += cnt;

        for(int i=0;i<2;i++) {
            if(answer[i] == 6) answer[i] = 1;
            else if(answer[i] == 5) answer[i] = 2;
            else if(answer[i] == 4) answer[i] = 3;
            else if(answer[i] == 3) answer[i] = 4;
            else if(answer[i] == 2) answer[i] = 5;
            else answer[i] = 6;
        }

        return answer;
    }

}