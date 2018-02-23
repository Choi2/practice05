package prob5;

public class MyStack<T> {

	private T[] buffer;
	private int top;
	
	@SuppressWarnings("unchecked")
	public MyStack(int size) {
		top = -1;
		buffer = (T[]) new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	public void push(T value) {
		
		if((top + 1) == buffer.length) {
			Object[] temp = new Object[buffer.length * 2];
			for(int i = 0; i < buffer.length; i ++) {
				temp[i] = buffer[i];
			}
			buffer = (T[]) temp;
		}
		
		buffer[++top] = value;
		/*System.out.println(Arrays.toString(buffer)); */
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public T pop() throws MyStackException {	
		if(isEmpty()) {
			throw new MyStackException();
		}
		return buffer[top--];
	}
	
}