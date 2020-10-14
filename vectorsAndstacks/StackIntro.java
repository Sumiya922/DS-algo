package vectorsAndstacks;

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> s=new MyStack<>();
		s.push(45);
		s.push(5);
		s.push(40);
		s.push(43);
		int popped=s.pop();
		System.out.println(popped);
		System.out.println(s.peek());
	}

}