package prob5;

public class MyStack {

	private String[] buffer;
	private int top;
	
	public MyStack(int size) {
		buffer = new String[size];
	}
	
	public void push(String value) {
		
		if(top == buffer.length) {
			String temp[] = new String[buffer.length * 2];
			for(int i = 0; i < buffer.length; i ++) {
				temp[i] = buffer[i];
			}
			buffer = temp;
		}
		
		buffer[top++] = value;
/*		System.out.println(Arrays.toString(buffer));*/
	}
	
	public boolean isEmpty() {
		return (top == 0) ? true : false;
	}
	
	public String pop() throws MyStackException {	
		if((top - 1) == -1) {
			throw new MyStackException();
		}
		return buffer[--top];
	}
	
}