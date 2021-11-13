import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;

        for(int i=0;i<sizes.length;i++) {
            if(sizes[i][0] >= sizes[i][1]) {
                width = Math.max(sizes[i][0], width);
                height = Math.max(sizes[i][1], height);
            } else {
                width = Math.max(sizes[i][1], width);
                height = Math.max(sizes[i][0], height);
            }
        }
        answer = width * height;
        return answer;
    }
}