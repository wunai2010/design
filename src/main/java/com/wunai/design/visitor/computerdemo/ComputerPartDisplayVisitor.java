package com.wunai.design.visitor.computerdemo;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	public void visit(Computer computer) {
		System.out.println("this  a computer");
	}

	public void visit(Mouse mouse) {
		System.out.println("this  a mouse");
	}

	public void visit(Keyboard keyboard) {
		System.out.println("this  a keyboard");
	}

	public void visit(Monitor monitor) {
		System.out.println("this  a monitor");
	}

}
