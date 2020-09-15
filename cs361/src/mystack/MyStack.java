/**
 * 
 */
package mystack;

/**
 * @author ADD YOUR NAME 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		return null;
	}

	public void push(T v) {
		// TODO To complete
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> stack1 = new MyStack<Integer>();
		// Push 1 and 2
		stack1.push(1);
		stack1.push(1);
		// Pop
		stack1.pop();
		// Push 5
		stack1.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> stack2 = new MyStack<Person>();
		// Push a person p1 with your name
		Person p1 = new Person();
		p1.setFname("Muirrin");
		p1.setLname("O'Connell");
		stack2.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person();
		p1.setFname("Christelle");
		p1.setLname("Scharff");
		stack2.push(p1);
	}

}
