package MyStack;

public class MyStack {
	private Node top;
	private int size;
	private final int MAX_SIZE = 10;
	
	public MyStack() {
		this.top = null;
		this.size = 0;
	}
	
	public class Node {
		private String data;
		private Node nextNode;
		
		public Node(String data) {
			this.data = data;
			this.nextNode = null;
		}
	}
	
	public boolean empty() {
		return top == null;
	}
	
	public boolean full() {
		if(this.size == MAX_SIZE) return true;
		
		return false;
	}
	
	public String push(String data) {
		if(full()) {
			System.out.println("Can not push!");
			return null;
		}
		
		Node node = new Node(data);
		node.nextNode = top;
		
		top = node;
		size++;
		
		return node.data;
	}
	
	public String peek() {
		if(empty()) {
			System.out.println("Can not peek!");
			return null;
		}
		return top.data;			
	}
	
	public String pop() {
		if(empty()) {
			System.out.println("Can not pop!");
			return null;
		}
		String data = peek();
		top = top.nextNode;
		size--;
		
		return data;
	}
	
	public int getSize() {
		return this.size;
	}
}
