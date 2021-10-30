import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList();
        list.add(arr[0]);
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] != arr[i+1]) {
                list.add(arr[i+1]);
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
}