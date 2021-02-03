package fr.mds.axel.tp5.java;

import java.util.Stack;

public class Invoker {

	private Stack<Command> history = new Stack<>();

	public void push(Command c) {
		this.history.push(c);
	}

	public Command pop() {
		return this.history.pop();
	}

	public boolean isEmpty() {
		return this.history.isEmpty();
	}

	public void showHistory() {
		for (Command command : this.history) {
			System.out.println(command);
		}
	}

}
