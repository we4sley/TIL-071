package BJ_11729;
import java.util.Scanner;

public class BJ_11729 {
	static int cnt=0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		hanoi(N, 1, 3, 2);
		System.out.println(cnt);
		System.out.println(sb);
		
		sc.close();
	}
	
	private static void hanoi(int N, int start, int dst, int temp) {
		cnt++;
		if(N==1) {
			sb.append(start + " " + dst + "\n");
			return;
		}
		
		hanoi(N-1, start, temp, dst);
		sb.append(start + " " + dst + "\n");
		hanoi(N-1, temp, dst, start);
	}
}
