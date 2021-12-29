class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char cae = s.charAt(i);

            if (cae >= 'a' && cae <= 'z') {
                if (cae + n > 'z') {
                    answer += (char)(cae + n - 26);
                } else {
                    answer += (char)(cae + n);
                }
            } else if (cae >= 'A' && cae <= 'z') {
                if (cae + n > 'Z') {
                    answer += (char)(cae + n - 26);
                } else {
                    answer += (char)(cae + n);
                }
            } else {
                answer += (char)cae;
            }
        }

        return answer;
    }
}