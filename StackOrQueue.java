package week7;
import java.util.*;
import java.io.*;

public class StackOrQueue {
// Fields
	
// Constructors

// Methods	
	
//My methods
	public void push(ArrayList<String> myList, String value) {
		System.out.println("We are adding '" + value + "' to the stack.");
		myList.add(0, value);
	}
	
	public void pop(ArrayList<String> myList) {
		System.out.println("We are removing '" + myList.get(0) + "' from the stack.");
		myList.remove(0);
	}
	
	public void peek(ArrayList<String> myList) {
		System.out.println("The first element in the stack is: " + myList.get(0));
	}
	
	public void size(ArrayList<String> myList) {
		System.out.println("The size of the stack is: " + myList.size());
	}
	
	public void isEmpty(ArrayList<String> myList) {
		if(myList.size() == 0) {
			System.out.println("The stack is empty.");
		}
	}
	
	public void print(ArrayList<String> myList) {
		myList.forEach(System.out::println);
	}
	
//Java API methods
	public void stack_push(Stack<String> stack, String value) { 
	    stack.push(value);
	    System.out.println(value + " has been added to the stack.");
	} 
	
	public void stack_pop(Stack<String> stack) 
    { 
        System.out.println(stack.pop() + " has been removed from the stack");
    } 
	
	public void stack_peek(Stack<String> stack) {
		System.out.print("The first element in the stack is: " + stack.peek());
	}
	
	public void stack_size(Stack<String> stack) {
		System.out.println("The size of the stack is: " + stack.size());
	}
	
	public void stack_isEmpty(Stack<String> stack) {
		if(stack.isEmpty()) {
			System.out.println("The stack is empty.");
		}
	}
	
	public void stack_print(Stack<String> stack) {
		stack.forEach(System.out::println);
	}
}