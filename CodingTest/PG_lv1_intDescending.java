import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        String str = new String("");
        for(int i=arr.length-1;i>=0;i--) {
            str += arr[i];
        }

        long answer = Long.parseLong(str);
        return answer;
    }
}