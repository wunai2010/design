package com.wunai.design.proxy;

public class RealSubject implements Subject {

	public void visit() {
		System.out.println("this is subject");
	}

}
