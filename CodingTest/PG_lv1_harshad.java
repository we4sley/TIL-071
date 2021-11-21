class Solution {
    public boolean solution(int x) {
        int harshad = 0;
        int num = x;
        while(num >= 1) {
            harshad += num%10;
            num /= 10;
        }
        if(x%harshad == 0)
            return true;
        else return false;
    }
}