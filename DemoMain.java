package week7;

import java.util.ArrayList;
import java.util.Stack;

public class DemoMain {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		StackOrQueue myStack = new StackOrQueue();
		
		myStack.push(myList, "First");
		for(int i = 0; i < 26; i++) {
			myStack.push(myList, String.valueOf((char)(i + 65)));
		}
		System.out.println();
		
		myStack.pop(myList);
		myStack.peek(myList);
		myStack.size(myList);
		myStack.isEmpty(myList);
		myStack.print(myList);
		System.out.println();
		
		myStack.stack_push(stack, "First");
		for(int i = 0; i <  26; i++) {
			String letter = String.valueOf((char)(i + 65));
			myStack.stack_push(stack, letter);
		}
		System.out.println();
		
		myStack.stack_pop(stack);
		myStack.stack_peek(stack);
		myStack.stack_size(stack);
		myStack.stack_isEmpty(stack);
		myStack.stack_print(stack);
		System.out.println();
	}

}
