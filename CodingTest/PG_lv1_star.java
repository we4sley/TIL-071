import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int row=0;row<m;row++) {
            for(int col=0;col<n;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}