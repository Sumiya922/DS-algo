package vectorsAndstacks;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Character> stack=new Stack<>();
		boolean isBalanced=true;
			String s=sc.nextLine();
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch=='(' || ch=='[' || ch=='{')
				{
					stack.push(ch);
					continue;
				}
				if(stack.empty())
				{
					isBalanced=false;
					break;
				}
				if(ch==')')
				{
				if(stack.peek()=='(')
				{
					stack.pop();
		
				}else {
					isBalanced=false;
					break;
				}
				}
				if(ch=='}')
				{
				if(stack.peek()=='{')
				{
					stack.pop();
					
				}else {
					isBalanced=false;
					break;
				}
				}
				if(ch==']')
				{
				if(stack.peek()=='[')
				{
					stack.pop();
				
				}
				else {
					isBalanced=false;
					break;
				}	
				}
			}
				if(!stack.empty())
				{
					isBalanced=false;
				}
				if(isBalanced==true)
				{
					System.out.println("balanced");
				}
				else
				{
						System.out.println(" not balanced");
					
				}
			}
			
		}
		
	

