package com.wunai.design.visitor;

public class ConcreteElement2 extends Element {

	public void doSomething() {
		System.out.println("ÕâÊÇÔªËØ2");
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
