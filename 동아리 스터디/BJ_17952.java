package MyStack;
import java.util.*;
import java.io.*;

public class BJ_17952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int total = 0;
		
		Stack<Assignment> assignmentStack = new Stack<>();
		StringTokenizer st;
		
		for(int i=0; i<N ;i++) {
			st = new StringTokenizer(br.readLine());
			if(Integer.parseInt(st.nextToken()) == 1) {
				assignmentStack.push(new Assignment(Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken())));
			}
			
			if(!assignmentStack.isEmpty()) {
				assignmentStack.peek().time--;
				
				if(assignmentStack.peek().time == 0)
					total += assignmentStack.pop().score;
			}	
		}
		System.out.println(total);
	}
}

class Assignment {
	int score, time;
	
	public Assignment(int score, int time) {
		this.score = score;
		this.time = time;
	}
}
