class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int num1 = Math.max(n, m);
        int num2 = Math.min(n, m);

        while (num2 > 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        answer[0] = num1;
        answer[1] = n*m / num1;

        return answer;
    }
}
