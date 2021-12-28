import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];

        for (int num : set) {
            list.add(num);
        }

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}