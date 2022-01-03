class Solution {
    public String solution(int a, int b) {
        String answer = "";

        String[] days = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int totalDate = 0;

        for (int i = 0; i < a - 1; i++) {
            totalDate += date[i];
        }

        totalDate += (b - 1);

        answer = days[totalDate % 7];

        return answer;
    }
}