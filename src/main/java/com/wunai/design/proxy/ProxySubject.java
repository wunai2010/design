package com.wunai.design.proxy;

public class ProxySubject implements Subject {
	private Subject subject;

	public ProxySubject(Subject subject) {
		this.subject = subject;
	}

	public void visit() {
		before();
		subject.visit();
		after();
	}

	private void after() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}
}
