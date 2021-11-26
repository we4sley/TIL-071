class Solution {
    public int[] solution(long n) {
        String ans = "" + n;
        int[] answer = new int[ans.length()];
        int cnt = 0;

        while(n>0) {
            answer[cnt] = (int)(n%10);
            n /= 10;
            cnt++;
        }
        return answer;
    }
}