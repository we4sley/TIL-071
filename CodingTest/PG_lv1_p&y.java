class Solution {
    boolean solution(String s) {

        String temp = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;

        for (int i=0;i<temp.length();i++) {
            if (temp.charAt(i) == 'p') {
                pCnt++;
            } else if(temp.charAt(i) == 'y') {
                yCnt++;
            }
        }

        if (pCnt == 0 && yCnt == 0) {
            return true;
        } else if (pCnt == yCnt) {
            return true;
        } else {
            return false;
        }
    }
}