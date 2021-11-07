package BJ_2805;
import java.util.Scanner;

public class BJ_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] tree = new int[N];
		int max = 0;
		int min = 0;
		
		for(int i=0;i<N;i++) {
			tree[i] = sc.nextInt();
			if(max < tree[i])
				max = tree[i];
		}
		
		while(min < max) {
			int mid = (max+min)/2;
			long sum = 0;
			
			for(int cutTree : tree) {
				if(cutTree - mid > 0) {
					sum += (cutTree - mid);
				}
			}
			
			if(sum < M) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		
		sc.close();
		System.out.println(min-1);
	}
}
