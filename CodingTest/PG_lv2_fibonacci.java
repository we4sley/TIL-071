class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 0 || n == 1) return n;
        int num = 0, numNext = 1;
        int sum = 0;

        for (int i=2;i<=n;i++) {
            sum = (num + numNext) %1234567;
            num = numNext;
            numNext = sum;
        }

        return sum;
    }
}