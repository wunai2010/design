package com.wunai.design.visitor.computerdemo;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
