package com.wunai.design.proxy;

public class TestStaticProxy {
	public static void main(String[] args) {
		ProxySubject subject = new ProxySubject(new RealSubject());
		subject.visit();
	}
}
