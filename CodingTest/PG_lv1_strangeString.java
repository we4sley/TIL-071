class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;

        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            if ((" ").equals(str[i])) {
                index = 0;
            } else {
                if (index % 2 == 0) {
                    index++;
                    str[i] = str[i].toUpperCase();
                } else {
                    index++;
                    str[i] = str[i].toLowerCase();
                }
            }
            answer += str[i];
        }

        return answer;
    }
}