import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] student_1 = {1,2,3,4,5};
        int[] student_2 = {2,1,2,3,2,4,2,5};
        int[] student_3 = {3,3,1,1,2,2,4,4,5,5};

        int[] cnt = new int[3];

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<answers.length;i++) {
            if(student_1[i%student_1.length] == answers[i])
                cnt[0]++;
            if(student_2[i%student_2.length] == answers[i])
                cnt[1]++;
            if(student_3[i%student_3.length] == answers[i])
                cnt[2]++;
        }
        int max = Math.max(Math.max(cnt[0],cnt[1]),cnt[2]);
        if(cnt[0] == max) list.add(1);
        if(cnt[1] == max) list.add(2);
        if(cnt[2] == max) list.add(3);

        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}